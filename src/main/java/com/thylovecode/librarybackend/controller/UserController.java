package com.thylovecode.librarybackend.controller;

import com.thylovecode.librarybackend.common.Result;
import com.thylovecode.librarybackend.controller.request.UserPageRequest;
import com.thylovecode.librarybackend.entity.User;
import com.thylovecode.librarybackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Result listUsers() {
        List<User> users = userService.listUser();
        return Result.success(users);
    }

    @GetMapping("/page")
    public Result Page(UserPageRequest userPageRequest) {
        Object page = userService.page(userPageRequest);
        return Result.success(page);
    }

    @PostMapping("/save")
    public Result save(@RequestBody User user) {
        userService.save(user);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody User user) {
        userService.updateUser(user);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        User users = userService.getById(id);
        return Result.success(users);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        userService.delete(id);
        return Result.success();
    }
}
