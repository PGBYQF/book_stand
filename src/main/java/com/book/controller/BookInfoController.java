package com.book.controller;

import com.book.common.ResultResponse;
import com.book.pojo.BookInfoPojo;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@Controller("/bookInfo")
@Api(value = "BookInfoController",description = "书基础信息")
public class BookInfoController {

    @PostMapping("/saveBookInfo")
    @ApiOperation(value = "添加书基础",notes = "添加书")
    @ApiImplicitParams ({
            @ApiImplicitParam(name = "bookInfoPojo", required = true, dataType = "BookInfoPojo")
    })
    public ResultResponse saveBookInfo(@RequestBody BookInfoPojo bookInfoP){
        return new ResultResponse("200","保存成功");
    }

    @GetMapping("/listBookInfo")
    @ApiOperation(value = "查询书列表",notes = "添加书")
    @ApiImplicitParams ({
            @ApiImplicitParam(name = "bookName", required = false, dataType = "String"),
            @ApiImplicitParam(name = "bookAutor", required = false, dataType = "String"),
            @ApiImplicitParam(name = "bookState", required = false, dataType = "integer"),
    })
    public ResultResponse listBookInfo(String bookName, String bookAutor,Integer bookState){
        System.out.println(bookName+"==="+bookAutor+"==="+bookState);
        return new ResultResponse("200","保存成功",10,new ArrayList<>());
    }
}
