package com.thylovecode.librarybackend.exception;

import lombok.Data;

/**
 * @Description: 自定义异常枚举类
 * @author: thy
 * @date: 2023年03月21日 12:16
 */


public enum MyExceptionEnum {
    SYSTEM_ERROR("10000", "系统错误"),
    USER_NOT_EXIST("10001", "用户不存在"),
    REQUEST_PARAM_ERROR("10002", "参数错误"),
    PASSWORD_ERROR("10003", "密码错误"),
    UPDATE_FAIL("10004", "修改失败");

    String code;
    String msg;

    MyExceptionEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
