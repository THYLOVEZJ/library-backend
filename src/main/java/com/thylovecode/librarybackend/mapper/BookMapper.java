package com.thylovecode.librarybackend.mapper;

import com.thylovecode.librarybackend.controller.request.BookPageRequest;
import com.thylovecode.librarybackend.controller.request.CategoryPageRequest;
import com.thylovecode.librarybackend.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月28日 9:44
 */

@Mapper
public interface BookMapper {
    List<Book> list();

    List<Book> listByCondition(BookPageRequest BookPageRequest);

    void save(Book category);

    Book getById(Integer id);

    void updateById(Book category);

    void delete(Integer id);
}
