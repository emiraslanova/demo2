package com.example.demo2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "book_entity")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "price",nullable = true)
    private Integer price;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "status",nullable = true)
    private Boolean status;

    @Column(name = "names",nullable = true)
    private String name;

}


