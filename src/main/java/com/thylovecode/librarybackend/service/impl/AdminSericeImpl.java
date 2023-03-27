package com.thylovecode.librarybackend.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thylovecode.librarybackend.controller.dto.LoginDTO;
import com.thylovecode.librarybackend.controller.request.*;
import com.thylovecode.librarybackend.entity.Admin;
import com.thylovecode.librarybackend.entity.User;
import com.thylovecode.librarybackend.exception.MyException;
import com.thylovecode.librarybackend.exception.MyExceptionEnum;
import com.thylovecode.librarybackend.mapper.AdminMapper;
import com.thylovecode.librarybackend.mapper.UserMapper;
import com.thylovecode.librarybackend.service.AdminService;
import com.thylovecode.librarybackend.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月14日 22:23
 */
@Service
public class AdminSericeImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> listAdmin() {
        return adminMapper.listAdmin();
    }

    @Override
    public Object page(BaseRequest baseRequest) {
        PageHelper.startPage(baseRequest.getPageNum(), baseRequest.getPageSize());
        List<Admin> admins = adminMapper.listByCondition(baseRequest);
        PageInfo<Admin> adminPageInfo = new PageInfo<>(admins);
        return adminPageInfo;
    }

    @Override
    public void save(Admin admin) {
        adminMapper.save(admin);
    }

    @Override
    public Admin getById(Integer id) {
        Admin admin = adminMapper.getById(id);
        return admin;
    }

    @Override
    public void updateAdmin(Admin admin) {
        adminMapper.updateAdmin(admin);
    }

    @Override
    public void delete(Integer id) {
        adminMapper.delete(id);
    }

    @Override
    public LoginDTO login(LoginRequest loginRequest) {
        Admin admin = new Admin();
        admin = adminMapper.getByUsername(loginRequest.getUsername());
        if (admin == null) {
            throw new MyException(MyExceptionEnum.USER_NOT_EXIST);
        }
        admin = adminMapper.getByUsernameAndPassword(loginRequest);
        if (admin == null) {
            throw new MyException(MyExceptionEnum.PASSWORD_ERROR);
        }
        LoginDTO loginDTO = new LoginDTO();
        BeanUtils.copyProperties(admin, loginDTO);
        return loginDTO;
    }

    @Override
    public void changePass(PasswordRequest request) {
        LoginRequest loginRequest = new LoginRequest(request.getUsername(), request.getPassword());
        Admin admin = adminMapper.getByUsernameAndPassword(loginRequest);
        if (admin == null) {
            throw new MyException(MyExceptionEnum.USER_NOT_EXIST);
        }
        int i = adminMapper.updatePassword(request.getNewPass(), request.getUsername());
        if (i <= 0) {
            throw new MyException(MyExceptionEnum.UPDATE_FAIL);
        }
    }
}
