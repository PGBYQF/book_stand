package com.book.service.impl;

import com.book.entity.BookChapter;
import com.book.mapper.BookChapterMapper;
import com.book.service.IBookChapterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 章节内容表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-12-17
 */
@Service
public class BookChapterServiceImpl extends ServiceImpl<BookChapterMapper, BookChapter> implements IBookChapterService {

}
