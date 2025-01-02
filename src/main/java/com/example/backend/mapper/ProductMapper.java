package com.example.backend.mapper;

import com.example.backend.dto.ProductDTO;
import com.example.backend.entity.Product;

public interface ProductMapper {
    Product toProduct(ProductDTO productDTO);

    ProductDTO toProductDTO(Product product);
}
