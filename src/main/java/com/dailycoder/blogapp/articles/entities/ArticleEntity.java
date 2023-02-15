package com.dailycoder.blogapp.articles.entities;

import com.dailycoder.blogapp.commons.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class ArticleEntity extends BaseEntity {

    @Column(unique = true,nullable = false,length = 150)
    String slug;

    @Column(nullable = false,length = 200)
    String title;

    String subtitle;

    @Column(nullable = false,length = 8000)
    String body;



}

