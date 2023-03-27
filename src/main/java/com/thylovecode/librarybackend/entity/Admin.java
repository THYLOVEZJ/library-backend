package com.thylovecode.librarybackend.entity;

import lombok.Data;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月14日 22:16
 */
@Data
public class Admin {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private Boolean state;
}
