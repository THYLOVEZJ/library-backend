package com.thylovecode.librarybackend.service.impl;

import com.thylovecode.librarybackend.entity.User;
import com.thylovecode.librarybackend.mapper.UserMapper;
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
public class UserSericeImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }
}
