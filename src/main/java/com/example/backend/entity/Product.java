package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;
    private BigDecimal productPrice;
    private String productDescription;
    private Integer productQuantity;
    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false) // Foreign key to Category
    private Category category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Image> images;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Price> prices;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Review> reviews;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem>  cartItems;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WishList>  wishList;


}
