package com.springboot.jpa.data.dto;

import lombok.*;

@Data
public class ProductResponseDto {
    private Long number;
    private String name;
    private int price;
    private int stock;
}
