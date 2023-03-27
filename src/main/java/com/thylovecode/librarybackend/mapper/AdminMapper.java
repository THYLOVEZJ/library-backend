package com.thylovecode.librarybackend.mapper;

import com.thylovecode.librarybackend.controller.request.BaseRequest;
import com.thylovecode.librarybackend.controller.request.LoginRequest;
import com.thylovecode.librarybackend.controller.request.UserPageRequest;
import com.thylovecode.librarybackend.entity.Admin;
import com.thylovecode.librarybackend.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月14日 22:20
 */

@Mapper
public interface AdminMapper {

    List<Admin> listAdmin();

    List<Admin> listByCondition(BaseRequest baseRequest);

    void save(Admin admin);

    Admin getById(Integer id);

    void updateAdmin(Admin admin);

    void delete(Integer id);

    Admin getByUsernameAndPassword(LoginRequest loginRequest);

    Admin getByUsername(String username);

    int updatePassword(String newPass, String username);
}
