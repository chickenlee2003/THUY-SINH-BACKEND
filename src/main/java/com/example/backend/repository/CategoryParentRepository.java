package com.example.backend.repository;

import com.example.backend.entity.CategoryParent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryParentRepository extends JpaRepository<CategoryParent, Long> {
} 