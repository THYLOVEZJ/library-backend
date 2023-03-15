package com.thylovecode.librarybackend.service;

import com.thylovecode.librarybackend.controller.request.UserPageRequest;
import com.thylovecode.librarybackend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月14日 22:22
 */

public interface UserService {
    List<User> listUser();


    Object page(UserPageRequest userPageRequest);
}
