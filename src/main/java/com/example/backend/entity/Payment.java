package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payments")
public class Payment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Column(nullable = false)
    private Double paymentAmount;

    @Column(nullable = false)
    private String paymentMethod; // e.g., "CREDIT_CARD", "PAYPAL", "BANK_TRANSFER"

    private String transactionId; // Unique ID provided by the payment gateway

    private String paymentGateway; // e.g., "Stripe", "PayPal", "Square"

    @Lob
    private String gatewayResponse; // Detailed response from the payment gateway

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
}
