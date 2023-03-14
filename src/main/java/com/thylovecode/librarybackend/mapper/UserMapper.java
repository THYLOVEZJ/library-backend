package com.thylovecode.librarybackend.mapper;

import com.thylovecode.librarybackend.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月14日 22:20
 */

@Mapper
public interface UserMapper {
//    @Select("select * from user")
    List<User> listUser();
}
