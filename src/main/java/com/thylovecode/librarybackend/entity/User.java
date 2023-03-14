package com.thylovecode.librarybackend.entity;

import lombok.Data;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月14日 22:16
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String address;
    private String sex;
    private String phone;
}
