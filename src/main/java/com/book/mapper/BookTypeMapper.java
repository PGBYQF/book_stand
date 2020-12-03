package com.book.mapper;

import com.book.pojo.BookTypePojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookTypeMapper {
    int deleteByPrimaryKey(String typeCode);

    int insert(BookTypePojo record);

    int insertSelective(BookTypePojo record);

    BookTypePojo selectByPrimaryKey(String typeCode);

    int updateByPrimaryKeySelective(BookTypePojo record);

    int updateByPrimaryKey(BookTypePojo record);
}