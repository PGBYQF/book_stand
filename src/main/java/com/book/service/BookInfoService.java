package com.book.service;

import com.book.common.HttpCodeEnum;
import com.book.common.ResultResponse;
import com.book.mapper.BookInfoMapper;
import com.book.pojo.BookInfoPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class BookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

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
}
