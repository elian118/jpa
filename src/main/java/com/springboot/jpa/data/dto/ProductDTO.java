package com.springboot.jpa.data.dto;

import lombok.*;

@Data
public class ProductDTO {
    private String name;
    private int price;
    private int stock;

}
