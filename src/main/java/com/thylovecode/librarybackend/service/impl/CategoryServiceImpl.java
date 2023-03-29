package com.thylovecode.librarybackend.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thylovecode.librarybackend.controller.request.CategoryPageRequest;
import com.thylovecode.librarybackend.entity.Category;
import com.thylovecode.librarybackend.mapper.CategoryMapper;
import com.thylovecode.librarybackend.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月28日 10:18
 */

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> listCategory() {
        return categoryMapper.list();
    }

    @Override
    public PageInfo<Category> page(CategoryPageRequest request) {
        PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<Category> category = categoryMapper.listByCondition(request);
        PageInfo<Category> categoryPageInfo = new PageInfo<>(category);
        return categoryPageInfo;
    }

    @Override
    public void save(Category category) {
        categoryMapper.save(category);
    }

    @Override
    public Category getById(Integer id) {
        return categoryMapper.getById(id);
    }

    @Override
    public void updateCategory(Category category) {
        category.setUpdatetime(new Date());
        categoryMapper.updateById(category);
    }

    @Override
    public void delete(Integer id) {
        categoryMapper.delete(id);
    }
}
