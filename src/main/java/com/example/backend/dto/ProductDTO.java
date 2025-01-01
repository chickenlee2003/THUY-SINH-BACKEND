package com.example.backend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDTO {
    Long productId;
    String productName;
    BigDecimal productPrice;
    String productDescription;
    Integer productQuantity;
    String productStatus; // Assuming this is a String, could also be an enum
    List<ImageDTO> images; // List of images associated with the product
    List<ReviewDTO> reviews; // List of reviews for the product
}