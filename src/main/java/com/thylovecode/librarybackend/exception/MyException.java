package com.thylovecode.librarybackend.exception;

/**
 * @Description: 自定义异常类
 * @author: thy
 * @date: 2023年03月21日 12:25
 */

public class MyException extends RuntimeException {
    private final String code;
    private final String message;

    public MyException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public MyException(MyExceptionEnum exceptionEnum) {
        this(exceptionEnum.getCode(), exceptionEnum.getMsg());
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
