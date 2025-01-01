package com.example.backend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartItemDTO {
    Long cartItemId;
    Long productId; // Assuming you want to link to the product
    Integer quantity;
    Double priceAtAddition; // Snapshot of the product price at the time it was added
}