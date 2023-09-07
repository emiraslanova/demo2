package com.example.demo2.service;

import com.example.demo2.dto.BookDto;
import com.example.demo2.entity.BookEntity;
import com.example.demo2.mapper.BookMapper;
import com.example.demo2.repository.BookRepository;
import com.example.demo2.service.imp.BookServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService implements BookServiceImpl {


    private final BookRepository bookRepository;
    private final BookMapper bookMapper;



    @Override
    public void creatBook(BookDto bookDto) {
        bookRepository.save(bookMapper.toEntity(bookDto));
    }

    @Override
    public BookDto readById(Integer id) {
        BookEntity bookEntity = bookRepository.findById(id).orElse(null);
        return bookMapper.toDto(bookEntity);
    }

    @Override
    public List<BookDto> readAll() {
        List<BookEntity> all = bookRepository.findAll();
        List<BookDto> bookDtoList = new ArrayList<>();

        for (BookEntity entity : all) {
            BookDto dto = bookMapper.toDto(entity);
            bookDtoList.add(dto);
        }

        return bookDtoList;
 }


    @Override
    public void deleteById(Integer id) {
        bookRepository.deleteById(id);

    }

    @Override
    public BookDto updateById(Integer id, BookDto bookDto) {
        BookEntity oldBook = bookRepository.findById(id).orElse(null);
        if (oldBook != null) {
            oldBook.setName(bookDto.getName());
            oldBook.setPrice(bookDto.getPrice());
            oldBook.setStatus(bookDto.getStatus());
            return bookMapper.toDto(bookRepository.save(bookMapper.toEntity(bookDto)));
        } else {
            return null;
        }
    }


}





