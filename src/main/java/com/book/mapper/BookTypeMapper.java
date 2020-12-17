package com.book.mapper;

import com.book.pojo.BookTypePojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookTypeMapper {
    int insert(BookTypePojo record);

    List<BookTypePojo> listBookType(@Param("typeName") String typeName);

    BookTypePojo findBookType(@Param("typeCode") String typeCode);

    int deleteType(@Param("typeCode") String typeCode);
}