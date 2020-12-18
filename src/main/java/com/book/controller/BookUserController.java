package com.book.controller;


import com.book.common.HttpCodeEnum;
import com.book.common.ResultResponse;
import com.book.entity.BookUser;
import com.book.service.IBookUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-12-17
 */
@RestController
@RequestMapping("/bookUser")
public class BookUserController {

    @Autowired
    private IBookUserService bookUserService;

    public ResultResponse saveBookUser(BookUser bookUser){
         bookUserService.save(bookUser);
         return  new ResultResponse(HttpCodeEnum.SUCCESS.getCode(),"添加成功");
    }
}
