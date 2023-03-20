package com.thylovecode.librarybackend.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thylovecode.librarybackend.controller.request.AdminPageRequest;
import com.thylovecode.librarybackend.controller.request.BaseRequest;
import com.thylovecode.librarybackend.controller.request.UserPageRequest;
import com.thylovecode.librarybackend.entity.Admin;
import com.thylovecode.librarybackend.entity.User;
import com.thylovecode.librarybackend.mapper.AdminMapper;
import com.thylovecode.librarybackend.mapper.UserMapper;
import com.thylovecode.librarybackend.service.AdminService;
import com.thylovecode.librarybackend.service.UserService;
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
}
