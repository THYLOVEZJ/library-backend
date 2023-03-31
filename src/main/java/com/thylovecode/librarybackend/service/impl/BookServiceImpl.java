package com.thylovecode.librarybackend.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thylovecode.librarybackend.controller.request.BookPageRequest;
import com.thylovecode.librarybackend.controller.request.BookPageRequest;
import com.thylovecode.librarybackend.entity.Book;
import com.thylovecode.librarybackend.entity.Book;
import com.thylovecode.librarybackend.mapper.BookMapper;
import com.thylovecode.librarybackend.service.BookService;
import com.thylovecode.librarybackend.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月28日 10:18
 */

@Service
@Slf4j
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> listBook() {
        return bookMapper.list();
    }

    @Override
    public PageInfo<Book> page(BookPageRequest request) {
        PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<Book> book = bookMapper.listByCondition(request);
        PageInfo<Book> bookPageInfo = new PageInfo<>(book);
        return bookPageInfo;
    }

    @Override
    public void save(Book book) {
        book.setCreatetime(new Date());
        book = setCategory(book);
        bookMapper.save(book);
    }

    private static Book setCategory(Book book) {
        StringBuilder sb = new StringBuilder();
        if (book.getCategories() != null) {
            book.getCategories().stream().forEach(v -> sb.append(v).append("/"));
            book.setCategory(sb.toString().substring(0, sb.lastIndexOf("/")));
        }
        return book;
    }

    @Override
    public Book getById(Integer id) {
        return bookMapper.getById(id);
    }

    @Override
    public void updateBook(Book book) {
        book.setUpdatetime(new Date());
        book = setCategory(book);
        bookMapper.updateById(book);
    }

    @Override
    public void delete(Integer id) {
        bookMapper.delete(id);
    }
}
