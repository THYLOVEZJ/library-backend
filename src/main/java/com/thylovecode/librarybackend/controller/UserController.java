package com.thylovecode.librarybackend.controller;

import com.thylovecode.librarybackend.entity.User;
import com.thylovecode.librarybackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月14日 22:26
 */

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> listUsers() {
        return userService.listUser();
    }
}
