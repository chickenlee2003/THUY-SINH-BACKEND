package com.example.backend.entity;


import jakarta.persistence.*;
import jakarta.persistence.metamodel.IdentifiableType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_status")
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderStatusId;

    private  String orderStatusName; // cac trang thai dong hang


    @OneToMany(mappedBy = "orderStatus" , cascade =  CascadeType.ALL)
    private List<Order> orders;

}
