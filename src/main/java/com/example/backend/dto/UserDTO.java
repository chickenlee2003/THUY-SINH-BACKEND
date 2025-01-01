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
public class UserDTO {
    Long userId;
    String email;
    String username;
    String password; // Consider not exposing this in DTOs
    String phoneNumber;
    String fullName;
    String avatar;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}