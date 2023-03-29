package com.thylovecode.librarybackend.controller.request;

import lombok.Data;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月28日 10:24
 */
@Data
public class CategoryPageRequest extends BaseRequest {
    private String name;
}
