package com.example.backend.service;

import com.example.backend.dto.CategoryParentDTO;
import com.example.backend.entity.CategoryParent;
import com.example.backend.entity.CommonStatus;
import com.example.backend.exception.ResourceNotFoundException;
import com.example.backend.mapper.CategoryParentMapper;
import com.example.backend.repository.CategoryParentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryParentService {
    private  final CategoryParentRepository categoryParentRepository;
    private  final CategoryParentMapper categoryParentMapper;

//   create category parent
    public CategoryParentDTO createCategoryParent(CategoryParentDTO categoryParentDTO) {
        CategoryParent categoryParent = categoryParentMapper.toCategoryParent(categoryParentDTO);
        categoryParent = categoryParentRepository.save(categoryParent);
        return categoryParentMapper.toCategoryParentDTO(categoryParent);
    }
//    get all category parent
    public List<CategoryParentDTO> getAllCategoryParent() {
        return categoryParentRepository.findAll().stream()
                .map(categoryParentMapper::toCategoryParentDTO)
                .collect(Collectors.toList());
    }
//    get all category parent by status
    public List<CategoryParentDTO> getAllCategoryParentByStatus(CommonStatus status) {
        return categoryParentRepository.findAllByStatus(status).stream()
                .map(categoryParentMapper::toCategoryParentDTO)
                .collect(Collectors.toList());
    }

    @Transactional
//    update category parent
    public CategoryParentDTO updateCategoryParent(Long id,CategoryParentDTO categoryParentDTO) {
        CategoryParent categoryParent = categoryParentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
        categoryParentMapper.updateCategoryParentFromDTO(categoryParentDTO, categoryParent);
        return categoryParentMapper.toCategoryParentDTO(categoryParentRepository.save(categoryParent));
    }
//    delete category parent
    public void deleteCategoryParent(Long id) {
        CategoryParent categoryParent = categoryParentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
        categoryParentRepository.delete(categoryParent);
    }

}
