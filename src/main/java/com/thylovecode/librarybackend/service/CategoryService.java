package com.thylovecode.librarybackend.service;

import com.github.pagehelper.PageInfo;
import com.thylovecode.librarybackend.controller.request.BaseRequest;
import com.thylovecode.librarybackend.controller.request.CategoryPageRequest;
import com.thylovecode.librarybackend.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> listCategory();

    PageInfo<Category> page(CategoryPageRequest request);

    void save(Category category);

    Category getById(Integer id);

    void updateCategory(Category category);

    void delete(Integer id);
}
