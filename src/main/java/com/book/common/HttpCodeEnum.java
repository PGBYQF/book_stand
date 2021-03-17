package com.book.common;

public enum  HttpCodeEnum {
    SUCCESS("200","操作成功"),
    FAILD("5000","操作失败"),
    NULLTOKEN("5001","没有token"),
    ;
    private String code;
    private String message;

    HttpCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
