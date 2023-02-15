package com.dailycoder.blogapp;



import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Table(name = "persons")
@Data
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;




}
