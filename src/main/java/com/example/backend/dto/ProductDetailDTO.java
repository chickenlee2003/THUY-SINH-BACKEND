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
public class ProductDetailDTO {
    Long productId;
    String productName;
    BigDecimal productPrice;
    String productDescription;
    Integer productQuantity;
    List<ImageDTO> images; // Assuming you have an ImageDTO
    List<ReviewDTO> reviews; // Assuming you have a ReviewDTO
}