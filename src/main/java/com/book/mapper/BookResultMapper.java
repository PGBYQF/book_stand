package com.book.mapper;

import com.book.pojo.BookResultPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookResultMapper {
    int deleteByPrimaryKey(String resultCode);

    int insert(BookResultPojo record);

    int insertSelective(BookResultPojo record);

    BookResultPojo selectByPrimaryKey(String resultCode);

    int updateByPrimaryKeySelective(BookResultPojo record);

    int updateByPrimaryKey(BookResultPojo record);
}