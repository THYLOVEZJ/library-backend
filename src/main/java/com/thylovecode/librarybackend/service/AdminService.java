package com.thylovecode.librarybackend.service;

import com.thylovecode.librarybackend.controller.dto.LoginDTO;
import com.thylovecode.librarybackend.controller.request.BaseRequest;
import com.thylovecode.librarybackend.controller.request.LoginRequest;
import com.thylovecode.librarybackend.controller.request.PasswordRequest;
import com.thylovecode.librarybackend.controller.request.UserPageRequest;
import com.thylovecode.librarybackend.entity.Admin;
import com.thylovecode.librarybackend.entity.User;

import java.util.List;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月14日 22:22
 */

public interface AdminService {
    List<Admin> listAdmin();

    Object page(BaseRequest baseRequest);

    void save(Admin admin);

    Admin getById(Integer id);

    void updateAdmin(Admin admin);

    void delete(Integer id);

    LoginDTO login(LoginRequest loginRequest);

    void changePass(PasswordRequest request);
}
