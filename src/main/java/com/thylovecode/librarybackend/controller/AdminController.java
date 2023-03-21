package com.thylovecode.librarybackend.controller;

import com.thylovecode.librarybackend.common.Result;
import com.thylovecode.librarybackend.controller.dto.LoginDTO;
import com.thylovecode.librarybackend.controller.request.AdminPageRequest;
import com.thylovecode.librarybackend.controller.request.LoginRequest;
import com.thylovecode.librarybackend.controller.request.UserPageRequest;
import com.thylovecode.librarybackend.entity.Admin;
import com.thylovecode.librarybackend.service.AdminService;
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
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping("/login")
    public Result login(@RequestBody LoginRequest loginRequest) {
        LoginDTO loginDTO = adminService.login(loginRequest);
        return Result.success(loginDTO);
    }

    @GetMapping("/all")
    public Result listUsers() {
        List<Admin> users = adminService.listAdmin();
        return Result.success(users);
    }

    @GetMapping("/page")
    public Result Page(AdminPageRequest adminPageRequest) {
        Object page = adminService.page(adminPageRequest);
        return Result.success(page);
    }

    @PostMapping("/save")
    public Result save(@RequestBody Admin admin) {
        adminService.save(admin);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Admin admin) {
        adminService.updateAdmin(admin);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Admin admins = adminService.getById(id);
        return Result.success(admins);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        adminService.delete(id);
        return Result.success();
    }
}
