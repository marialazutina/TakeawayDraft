//package com.takeawaydraft.Models;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import java.sql.Timestamp;
//
//@Data
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private Integer orderId;
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Customer customer;
//    @ManyToMany(fetch = FetchType.LAZY)
//    private FoodItem foodItem;
//    private Integer quantity;
////    private Double price;
//    private String note;
//    @CreationTimestamp
//    private Timestamp createdAt;
//    @UpdateTimestamp
//    private Timestamp updatedAt;
//    private boolean orderStatus;
////private String payment;
//}
