package com.book.common;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value ="ResultResponse",description = "通用返回类")
@Data
@Setter
@Getter
public class ResultResponse<T> {

    private String code;
    private String message;
    private long total;
    private T result;

    public ResultResponse(String code, String message, long total, T result) {
        this.code = code;
        this.message = message;
        this.total = total;
        this.result = result;
    }

    public ResultResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultResponse(String code, T result) {
        this.code = code;
        this.result = result;
    }


}
