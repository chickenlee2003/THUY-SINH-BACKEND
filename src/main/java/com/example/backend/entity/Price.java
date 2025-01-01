package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long priceId;
    private Double priceAmount;
    private LocalDate effectiveDate;
    private Boolean isActive = true;
    private LocalDate updatedAt = LocalDate.now();


    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
    @OneToMany(mappedBy = "price")
    private List<OrderDetail> orderDetails;
}
