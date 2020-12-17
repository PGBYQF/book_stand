package com.book;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.book.mapper")
public class BookStandApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookStandApplication.class, args);
    }
}
