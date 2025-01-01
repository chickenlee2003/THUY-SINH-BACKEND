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
public class PolicyDTO {
    Long policyId;
    String policyName;
    String policyDescription;
    String policyContent;
    String isVisible; // Assuming this is a String, could also be Boolean
}