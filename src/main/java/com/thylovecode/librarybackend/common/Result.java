package com.thylovecode.librarybackend.common;

import com.thylovecode.librarybackend.exception.MyExceptionEnum;
import lombok.Data;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月15日 10:55
 */

@Data
public class Result<T> {
    private static final String SUCCESS_CODE = "200";
    private static final String ERROR_CODE = "500";

    private String code;
    private T data;
    private String msg;

    public static Result success() {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setData(data);
        return result;
    }

    public static Result error(String msg) {
        Result result = new Result();
        result.setCode(ERROR_CODE);
        result.setMsg(msg);
        return result;
    }

    public static Result error(String code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> error(MyExceptionEnum ex) {
        Result result = new Result();
        result.setCode(ex.getCode());
        result.setMsg(ex.getMsg());
        return result;
    }
}
