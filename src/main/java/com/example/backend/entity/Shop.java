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
@Table(name = "shop")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shopId;

    @Column(nullable = false, unique = true)
    private String shopName;

    private String shopPhoneNumber;

    @Column(nullable = false)
    private String shopEmail;

    private String shopFacebookLink;

    @Column(length = 1000)
    private String shopDescription;

    private Boolean isActive = true;

    private String workingTime;

    private String businessCode;

    @OneToOne
            @JoinColumn(name = "location_id")
    private Location location;

    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderRequest> orderRequests;
}
