package com.example.backend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReviewDTO {
    Long reviewId;
    Long productId; // Assuming you want to link to the product
    Double rating;
    String comment;
    LocalDateTime createdAt; // Timestamp for when the review was created
}