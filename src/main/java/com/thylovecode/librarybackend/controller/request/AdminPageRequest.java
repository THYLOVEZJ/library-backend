package com.thylovecode.librarybackend.controller.request;

import lombok.Data;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月15日 11:14
 */
@Data
public class AdminPageRequest extends BaseRequest {
    private String username;
    private String phone;
    private String email;
}
