package com.thylovecode.librarybackend.controller.request;

import lombok.Data;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月21日 11:39
 */
@Data
public class LoginRequest {
    private String username;
    private String password;
}
