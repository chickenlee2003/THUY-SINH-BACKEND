package com.example.backend.repository;

import com.example.backend.entity.CategoryParent;
import com.example.backend.entity.CommonStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryParentRepository extends JpaRepository<CategoryParent, Long> {
    List<CategoryParent> findAllByStatus(CommonStatus status);
} 