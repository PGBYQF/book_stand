package com.book.service;

import com.book.common.*;
import com.book.mapper.BookTypeMapper;
import com.book.pojo.BookTypePojo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookTypeService {

    @Autowired
    private BookTypeMapper bookTypeMapper;

    public ResultResponse saveBookType(BookTypePojo bookTypePojo){
        if(bookTypePojo ==null){
            return new ResultResponse(HttpCodeEnum.FAILD.getCode(),"请传入参数");
        }
        if(StringUtils.isEmpty(bookTypePojo.getTypeName())){
            return new ResultResponse(HttpCodeEnum.FAILD.getCode(),"请确认类名");
        }
        bookTypePojo.setTypeCode(IdCreateUtil.getCode("BT"));
        bookTypePojo.setCreateTime(LocalTimeUtil.getNowDateTime());
        bookTypeMapper.insert(bookTypePojo);
        return new ResultResponse(HttpCodeEnum.SUCCESS.getCode(),"添加分类成功");
    }

    public ResultResponse<BookTypePojo> listBookType(String typeName,Integer isPage,Integer pageSize,Integer pageNumber){
        List<BookTypePojo> resultList = new ArrayList<>();
        long total = 0;
        if(StringUtils.isEmpty(isPage) ==false && isPage.equals(YesNoEnum.YES.getCode())){
            PageHelper.startPage(pageNumber,pageSize);
            PageInfo<BookTypePojo> pageInfo = new PageInfo<>(bookTypeMapper.listBookType(typeName));
            resultList = pageInfo.getList();
            total = pageInfo.getTotal();
        }else{
            resultList = bookTypeMapper.listBookType(typeName);
            total= resultList.size();
        }
        return new ResultResponse(HttpCodeEnum.SUCCESS.getCode(),"查询成功",total,resultList);
    }

    public ResultResponse<BookTypePojo> findBookType(String typeCode){
        if(StringUtils.isEmpty(typeCode)){
            return new ResultResponse(HttpCodeEnum.FAILD.getCode(),"请确认类编号");
        }
        BookTypePojo bookTypePojo = bookTypeMapper.findBookType(typeCode);
        return new ResultResponse(HttpCodeEnum.SUCCESS.getCode(),bookTypePojo);
    }

    public ResultResponse deleteType(String typeCode){
        if(StringUtils.isEmpty(typeCode)){
            return new ResultResponse(HttpCodeEnum.FAILD.getCode(),"请确认类编号");
        }
        bookTypeMapper.deleteType(typeCode);
        return new ResultResponse(HttpCodeEnum.SUCCESS.getCode(),"删除分类成功");
    }

}
