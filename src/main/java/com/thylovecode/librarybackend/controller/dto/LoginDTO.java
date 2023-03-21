package com.thylovecode.librarybackend.controller.dto;

import lombok.Data;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月21日 11:42
 */

@Data
public class LoginDTO {
    private Integer id;
    private String username;
    private String phone;
    private String email;
}
