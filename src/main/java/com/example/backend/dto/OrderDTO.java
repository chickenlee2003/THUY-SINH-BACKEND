package com.example.backend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDTO {
    Long orderId;
    Long userId; // Assuming you want to link to the user
    List<CartItemDTO> cartItems; // List of items in the order
    String shippingAddress;
    String paymentMethod;
    String note;
    String orderStatus; // Assuming this is a String, could also be an enum
}