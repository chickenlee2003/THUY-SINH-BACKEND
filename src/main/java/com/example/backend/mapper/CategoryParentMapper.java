package com.example.backend.mapper;

import com.example.backend.dto.CategoryParentDTO;
import com.example.backend.entity.CategoryParent;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface CategoryParentMapper {

    // Chuyển đổi từ DTO sang Entity
    CategoryParent toCategoryParent(CategoryParentDTO categoryParentDTO);

    // Chuyển đổi từ Entity sang DTO
    CategoryParentDTO toCategoryParentDTO(CategoryParent categoryParent);
//    updateCategoryParentFromDTO
        void updateCategoryParentFromDTO(CategoryParentDTO categoryParentDTO,@MappingTarget CategoryParent categoryParent);
}
