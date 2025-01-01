package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "voucher")
public class Voucher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long voucherId;

    @Column(nullable = false, unique = true)
    private String voucherCode; // Unique code for the voucher

    @Column(nullable = false)
    private Double value; // Discount value (e.g., percentage or fixed amount)

    @Column(nullable = false)
    private LocalDateTime startDate; // Start date of validity

    @Column(nullable = false)
    private LocalDateTime endDate; // End date of validity

    @Column(nullable = false)
    private Integer quantity; // Total available uses

    @Column(nullable = false)
    private Double minPriceToUse; // Minimum price to apply the voucher

    @Column(nullable = false)
    private Boolean visible = true; // Whether the voucher is visible to users

    private Integer currentUses = 0; // Tracks how many times the voucher has been used

    @OneToMany(mappedBy = "voucher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders; // Orders that have used this voucher
}
