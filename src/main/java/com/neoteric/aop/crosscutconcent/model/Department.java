package com.neoteric.aop.crosscutconcent.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
}
