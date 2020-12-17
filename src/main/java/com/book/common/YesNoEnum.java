package com.book.common;

public enum  YesNoEnum {
    YES(1,"true"),
    NO(2,"false");

    private Integer code;
    private String messge;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessge() {
        return messge;
    }

    public void setMessge(String messge) {
        this.messge = messge;
    }

    YesNoEnum(Integer code, String messge) {
        this.code = code;
        this.messge = messge;
    }
}
