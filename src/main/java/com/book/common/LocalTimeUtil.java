package com.book.common;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeUtil {

    private static final String formatter_data_time = "yyyy-MM-dd HH:mm:ss";
    private static final String formatte_data = "yyyy-MM-dd";
    private static final String formatter_time = "HH:mm:ss";

    /**
     * 获取当前时间
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String getNowDateTime(){
        return  LocalDateTime.now().format(DateTimeFormatter.ofPattern(formatter_data_time));
    }
    /**
     * 获取当前时间
     * @return HH:mm:ss
     */
    public static String getNowTime(){
        return  LocalDateTime.now().format(DateTimeFormatter.ofPattern(formatter_time));
    }
    /**
     * 获取当前时间
     * @return yyyy-MM-dd
     */
    public static String getNowDate(){
        return  LocalDateTime.now().format(DateTimeFormatter.ofPattern(formatte_data));
    }

    public static void main(String[] args) {
        System.out.println(getNowDateTime());
        System.out.println(getNowTime());
        System.out.println(getNowDate());
    }
}
