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
public class OrderDetailDTO {
    Long orderDetailId;
    Long orderId; // Assuming you want to link to the order
    Long productId; // Assuming you want to link to the product
    Double orderDetailPrice; // Price at the time of order
    Integer orderDetailQuantity;
    Double orderDetailDiscount; // Any discounts applied
    Double totalPrice; // Calculated price
}