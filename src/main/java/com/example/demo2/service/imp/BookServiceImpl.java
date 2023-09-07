package com.example.demo2.service.imp;

import com.example.demo2.dto.BookDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookServiceImpl {


    void creatBook(BookDto bookDto);

    BookDto readById(Integer id);

    List<BookDto> readAll();


    void deleteById(Integer id);

    BookDto updateById(Integer id, BookDto bookDto);
}


