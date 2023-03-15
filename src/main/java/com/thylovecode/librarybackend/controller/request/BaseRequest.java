package com.thylovecode.librarybackend.controller.request;

import lombok.Data;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月15日 11:15
 */
@Data
public class BaseRequest {
    private Integer pageNum = 1;
    private Integer pageSize = 10;
}
