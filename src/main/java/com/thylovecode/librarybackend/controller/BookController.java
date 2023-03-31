package com.thylovecode.librarybackend.controller;

import com.thylovecode.librarybackend.common.Result;
import com.thylovecode.librarybackend.controller.request.BookPageRequest;
import com.thylovecode.librarybackend.entity.Book;
import com.thylovecode.librarybackend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月28日 10:58
 */
@CrossOrigin
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/all")
    public Result listBook() {
        List<Book> users = bookService.listBook();
        return Result.success(users);
    }

    @GetMapping("/page")
    public Result Page(BookPageRequest pageRequest) {
        Object page = bookService.page(pageRequest);
        return Result.success(page);
    }

    @PostMapping("/save")
    public Result save(@RequestBody Book book) {
        bookService.save(book);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Book book) {
        bookService.updateBook(book);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        return Result.success(book);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        bookService.delete(id);
        return Result.success();
    }

}
