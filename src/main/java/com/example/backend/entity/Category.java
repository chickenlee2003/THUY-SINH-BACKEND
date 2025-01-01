package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categories")
public class Category{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long categoryId;
    private  String categoryName;
    private String categoryDescription;
    private String categoryIcon;

    @Enumerated(EnumType.STRING)
    private CommonStatus status;

    @ManyToOne
    @JoinColumn(name = "categoryParentId")
    private CategoryParent CategoryParent;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

}
