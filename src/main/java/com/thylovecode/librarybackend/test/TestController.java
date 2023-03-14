package com.thylovecode.librarybackend.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月14日 22:11
 */

@RestController
public class TestController {
    @GetMapping("/")
    public String getMethod(){
        return "hello!";
    }
}
