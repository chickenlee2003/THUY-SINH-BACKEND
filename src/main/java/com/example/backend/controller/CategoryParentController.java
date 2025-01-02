package com.example.backend.controller;


import com.example.backend.dto.CategoryParentDTO;
import com.example.backend.entity.CommonStatus;
import com.example.backend.service.CategoryParentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/category-parent")
public class CategoryParentController {
    private  final CategoryParentService categoryParentService;

    @PostMapping
    public ResponseEntity<CategoryParentDTO> createCategoryParent(@Valid @RequestBody CategoryParentDTO categoryParentDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryParentService.createCategoryParent(categoryParentDTO));
    }
    @GetMapping
    public ResponseEntity<?> getAllCategoryParent() {
        return ResponseEntity.ok(categoryParentService.getAllCategoryParent());
    }
    @GetMapping("/status/{status}")
    public ResponseEntity<?> getAllCategoryParentByStatus(@PathVariable CommonStatus status) {
        return ResponseEntity.ok(categoryParentService.getAllCategoryParentByStatus(status));
    }
    @PutMapping("/{id}")
    public ResponseEntity<CategoryParentDTO> updateCategoryParent(@PathVariable Long id, @Valid @RequestBody CategoryParentDTO categoryParentDTO) {
        return ResponseEntity.ok(categoryParentService.updateCategoryParent(id, categoryParentDTO));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCategoryParent(@PathVariable Long id) {
        categoryParentService.deleteCategoryParent(id);
        return ResponseEntity.ok().build();
    }
}
