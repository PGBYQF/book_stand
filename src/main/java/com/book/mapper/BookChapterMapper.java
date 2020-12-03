package com.book.mapper;

import com.book.pojo.BookChapterPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookChapterMapper {
    int insert(BookChapterPojo record);

    int insertSelective(BookChapterPojo record);
}