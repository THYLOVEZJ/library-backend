package com.thylovecode.librarybackend.controller.request;

import lombok.Data;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月29日 13:09
 */
@Data
public class BookPageRequest extends BaseRequest{
    private String name;
    private String isbn;
}
