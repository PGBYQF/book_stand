package com.book.common;

public class IdCreateUtil {

    public static String getCode(String prefix) {
        //获取随机数
        Long nextId = IdWorker.getInstance().nextId();

        if (prefix == null) {
            return "" + nextId;
        }
        //拼接code
        String code = prefix + nextId;
        return code;
    }

}
