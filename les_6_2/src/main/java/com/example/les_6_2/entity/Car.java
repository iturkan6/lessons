package com.example.les_6_2.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column
    String reg_number;
    @Column
    String model;

    @ManyToMany(targetEntity = Driver.class, mappedBy = "cars", cascade = CascadeType.ALL)
    private Set<Driver> drivers;
}
