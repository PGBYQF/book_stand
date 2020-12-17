package com.book.controller;

import com.book.common.HttpCodeEnum;
import com.book.common.ResultResponse;
import com.book.pojo.BookTypePojo;
import com.book.service.BookTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller("/bookType")
@Api(value = "BookTypeController",description = "书分类信息")
public class BookTypeController {

    @Autowired
    private BookTypeService bookTypeService;

    @PostMapping("/saveBookType")
    @ApiOperation(value = "添加书分类",notes = "分类")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "bookTypePojo", required = true, dataType = "BookTypePojo")
    })
    public ResultResponse saveBookInfo(@RequestBody BookTypePojo bookTypePojo){
        return bookTypeService.saveBookType(bookTypePojo);
    }

    @GetMapping("/listBookType")
    @ApiOperation(value = "查询书分类列表",notes = "分类")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "typeName", required = false, dataType = "String"),
            @ApiImplicitParam(name = "isPage", required = false, dataType = "integer"),
            @ApiImplicitParam(name = "pageSize", required = false, dataType = "integer"),
            @ApiImplicitParam(name = "pageNumber", required = false, dataType = "integer"),
    })
    public ResultResponse<BookTypePojo> listBookType(String typeName,Integer isPage,Integer pageSize,Integer pageNumber){
        return bookTypeService.listBookType(typeName,isPage,pageSize,pageNumber);
    }

    @GetMapping("/findBookType")
    @ApiOperation(value = "查询书分类",notes = "分类")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "typeCode", required = true, dataType = "String"),
    })
    public ResultResponse<BookTypePojo> findBookType(String typeCode){
        return bookTypeService.findBookType(typeCode);
    }

    @PostMapping("/deleteType")
    @ApiOperation(value = "删除书分类",notes = "分类")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "typeCode", required = true, dataType = "String"),
    })
    public ResultResponse deleteType(String typeCode){
        return bookTypeService.deleteType(typeCode);
    }
}
