package com.book.service.impl;

import com.book.entity.BookUser;
import com.book.mapper.BookUserMapper;
import com.book.service.IBookUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-12-17
 */
@Service
public class BookUserServiceImpl extends ServiceImpl<BookUserMapper, BookUser> implements IBookUserService {

}
