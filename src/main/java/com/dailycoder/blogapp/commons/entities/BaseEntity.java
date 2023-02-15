package com.dailycoder.blogapp.commons.entities;


import jakarta.persistence.*;
import lombok.Generated;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @CreatedDate()
    @Column(name = "crtd_dt")
    Date createdDate;

}
