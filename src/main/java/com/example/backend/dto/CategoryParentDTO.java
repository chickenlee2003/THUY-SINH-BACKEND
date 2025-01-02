package com.example.backend.dto;

import com.example.backend.entity.CommonStatus;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryParentDTO {
    private Long categoryParentId;
    private String categoryParentName;
    private String categoryParentIcon;
    private CommonStatus status; // Enum để phản ánh trạng thái
}
