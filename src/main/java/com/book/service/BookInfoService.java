package com.book.service;

import com.book.common.HttpCodeEnum;
import com.book.common.ResultResponse;
import com.book.mapper.BookInfoMapper;
import com.book.pojo.BookInfoPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
public class BookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Value("${system.filepath}")
    private String systemFilePath;
    @Value("${system.urlpath}")
    private String urlpath;

    public ResultResponse saveBookInfo(BookInfoPojo bookInfoPojo){
        if(bookInfoPojo ==null){
            return new ResultResponse(HttpCodeEnum.FAILD.getCode(),"请传入对象信息");
        }
        if(StringUtils.isEmpty(bookInfoPojo.getBookName()) ){
            return new ResultResponse(HttpCodeEnum.FAILD.getCode(),"请输入书名");
        }
        if(StringUtils.isEmpty(bookInfoPojo.getBookAutor()) ){
            return new ResultResponse(HttpCodeEnum.FAILD.getCode(),"请输入作者名");
        }
        if(StringUtils.isEmpty(bookInfoPojo.getBookTypeCode()) ){
            return new ResultResponse(HttpCodeEnum.FAILD.getCode(),"请确认书分类");
        }
        return null;
    }

    public ResultResponse editor(MultipartFile file) {
        String fileName = "";
        if (!file.isEmpty()) {
            //返回的是字节长度,1M=1024k=1048576字节 也就是if(fileSize<5*1048576)
            if (file.getSize() > (1048576 * 5)) {
                return  new ResultResponse(HttpCodeEnum.FAILD.getCode(),"文件太大，请上传小于5MB的");
            }
            String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            if (StringUtils.isEmpty(suffix)) {
                return  new ResultResponse(HttpCodeEnum.FAILD.getCode(),"上传文件没有后缀，无法识别");
            }

            fileName = System.currentTimeMillis() + suffix;
            String saveFileName =systemFilePath + "/" + fileName;
            System.out.println(saveFileName);
            File dest = new File(saveFileName);
            System.out.println(dest.getParentFile().getPath());
            if (!dest.getParentFile().exists()) { //判断文件父目录是否存在
                dest.getParentFile().mkdir();
            }
            try {
                file.transferTo(dest); //保存文件
            } catch (Exception e) {
                e.printStackTrace();
                return  new ResultResponse(HttpCodeEnum.FAILD.getCode(),"上传失败" + e.getMessage());
            }
        } else {
            return  new ResultResponse(HttpCodeEnum.FAILD.getCode(),"上传出错,文件为空" );
        }
        String imgUrl = urlpath+"/" + fileName;
        return  new ResultResponse(HttpCodeEnum.SUCCESS.getCode(),imgUrl);
    }
}
