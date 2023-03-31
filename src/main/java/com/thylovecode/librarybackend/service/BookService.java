package com.thylovecode.librarybackend.service;

import com.github.pagehelper.PageInfo;
import com.thylovecode.librarybackend.controller.request.BookPageRequest;
import com.thylovecode.librarybackend.controller.request.CategoryPageRequest;
import com.thylovecode.librarybackend.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> listBook();

    PageInfo<Book> page(BookPageRequest request);

    void save(Book book);

    Book getById(Integer id);

    void updateBook(Book book);

    void delete(Integer id);
}
