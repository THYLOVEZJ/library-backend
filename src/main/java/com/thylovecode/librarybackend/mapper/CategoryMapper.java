package com.thylovecode.librarybackend.mapper;

import com.thylovecode.librarybackend.controller.request.CategoryPageRequest;
import com.thylovecode.librarybackend.controller.request.UserPageRequest;
import com.thylovecode.librarybackend.entity.Category;
import com.thylovecode.librarybackend.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月28日 9:44
 */

@Mapper
public interface CategoryMapper {
    List<Category> list();

    List<Category> listByCondition(CategoryPageRequest categoryPageRequest);

    void save(Category category);

    Category getById(Integer id);

    void updateById(Category category);

    void delete(Integer id);
}
