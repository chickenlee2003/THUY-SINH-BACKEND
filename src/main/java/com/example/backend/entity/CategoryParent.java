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
@Table(name = "categories_parent")
public class CategoryParent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long categoryParentId;
    private  String categoryParentName;
    private String categoryParentIcon;

    @Enumerated(EnumType.STRING)
    private CommonStatus status;


    @OneToMany(mappedBy = "CategoryParent", cascade = CascadeType.ALL)
    private List<Category> categories;

}
