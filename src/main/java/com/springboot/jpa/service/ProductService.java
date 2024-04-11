package com.springboot.jpa.service;

import com.springboot.jpa.data.dto.ProductDTO;
import com.springboot.jpa.data.dto.ProductResponseDto;

public interface ProductService {
    ProductResponseDto getProduct(Long number);
    ProductResponseDto saveProduct(ProductDTO productDTO);
    ProductResponseDto changeProductName(Long number, String name) throws Exception;
    void deleteProduct(Long number) throws Exception;
}
