package com.example.backend.mapper;

import com.example.backend.dto.CategoryDTO;
import com.example.backend.entity.Category;

public interface CategoryMapper {
    Category toCategory(CategoryDTO categoryDTO);

    CategoryDTO toCategoryDTO(Category category);
}
