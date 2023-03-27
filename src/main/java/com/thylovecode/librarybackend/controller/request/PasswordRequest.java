package com.thylovecode.librarybackend.controller.request;

import lombok.Data;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月27日 12:56
 */
@Data
public class PasswordRequest {
    private String username;
    private String password;
    private String newPass;
}
