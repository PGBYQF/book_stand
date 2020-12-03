package com.book.controller;

import com.book.pojo.BookTypePojo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller("/bookType")
@Api(value = "BookTypeController",description = "书分类信息")
public class BookTypeController {

    @PostMapping("/saveBookType")
    @ApiOperation(value = "添加书分类",notes = "分类")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "bookTypePojo", required = true, dataType = "BookTypePojo")
    })
    public void saveBookInfo(@RequestBody BookTypePojo bookTypePojo){
        return;
    }
}
