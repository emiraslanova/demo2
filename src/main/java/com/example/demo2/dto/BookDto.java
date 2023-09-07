package com.example.demo2.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class BookDto {


    @NotNull
    private String name;
    @NotNull
    private Integer price;
    @NotNull
    private Boolean status;


}


