package com.book.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.book.pojo.BookChapterPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookChapterMapper  extends BaseMapper<BookChapterPojo> {
    int insert(BookChapterPojo record);

    int insertSelective(BookChapterPojo record);
}