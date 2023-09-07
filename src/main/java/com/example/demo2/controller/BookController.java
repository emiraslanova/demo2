package com.example.demo2.controller;

import com.example.demo2.dto.BookDto;
import com.example.demo2.entity.BookEntity;
import com.example.demo2.service.imp.BookServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookServiceImpl bookServiceImpl;


    @PostMapping
    public void creatBook(@Valid @RequestBody BookDto bookDto) {
        bookServiceImpl.creatBook(bookDto);
    }

    @GetMapping("/{id}")
    public BookDto readById(@PathVariable Integer id) {
        return bookServiceImpl.readById(id);

    }

    @GetMapping
    public List<BookDto> readAll() {
        return bookServiceImpl.readAll();

    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable Integer id, @RequestBody BookDto bookDto) {
        bookServiceImpl.updateById(id, bookDto);


    }

    @DeleteMapping("/{id}")

    public void deleteById(@PathVariable(name = "id") Integer id) {
        bookServiceImpl.deleteById(id);
    }


    //BookService classi injection etmelisinin(nece edeceyinizi bilmeseniz yazin)
    //Controller clasina lazim olan annotation lari yazin
    //Service classinda olan metodlari Mappingler ile qeyd edin
    //Metoda lazim olan id-ni @Pathvarable ile book-u ise @RequestBody ile alin
    //ilk once service classini yazin onun komeyi ile buradaki metodlari
}


