package com.example.demo2.repository;


import com.example.demo2.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;




public interface BookRepository extends JpaRepository<BookEntity,Integer> {




}