package com.dailycoder.blogapp.commons.entities;

import com.dailycoder.blogapp.articles.entities.ArticleEntity;
import com.dailycoder.blogapp.user.entities.UserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

public class Comments {

    @Column(nullable = false,length = 100)
    String title;

    @Column(nullable = false,length = 1000)
    String body;

    @ManyToOne
    UserEntity author;

    @ManyToOne
    ArticleEntity article;

}
