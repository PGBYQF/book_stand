package com.book;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.book.mapper")
@Configuration
@SpringBootApplication
public class BookStandApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookStandApplication.class, args);
    }
}
