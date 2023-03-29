package com.thylovecode.librarybackend.controller;

import com.thylovecode.librarybackend.common.Result;
import com.thylovecode.librarybackend.controller.request.CategoryPageRequest;
import com.thylovecode.librarybackend.controller.request.UserPageRequest;
import com.thylovecode.librarybackend.entity.Category;
import com.thylovecode.librarybackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月28日 10:58
 */
@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/all")
    public Result listCategories() {
        List<Category> users = categoryService.listCategory();
        return Result.success(users);
    }

    @GetMapping("/page")
    public Result Page(CategoryPageRequest pageRequest) {
        Object page = categoryService.page(pageRequest);
        return Result.success(page);
    }

    @PostMapping("/save")
    public Result save(@RequestBody Category category) {
        categoryService.save(category);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Category category) {
        categoryService.updateCategory(category);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Category users = categoryService.getById(id);
        return Result.success(users);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        categoryService.delete(id);
        return Result.success();
    }
}
