package com.example.demo2.mapper;

import com.example.demo2.dto.BookDto;
import com.example.demo2.entity.BookEntity;
import org.mapstruct.Mapper;

@Mapper()
public abstract class BookMapper {

    public abstract BookDto toDto(BookEntity entity);

    public abstract BookEntity toEntity(BookDto dto);

}
