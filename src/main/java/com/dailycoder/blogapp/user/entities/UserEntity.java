package com.dailycoder.blogapp.user.entities;


import java.util.List;
import com.dailycoder.blogapp.articles.entities.ArticleEntity;
import com.dailycoder.blogapp.commons.entities.BaseEntity;
import jakarta.persistence.*;
import org.apache.catalina.User;

@Entity
public class UserEntity extends BaseEntity {

    @Column(unique = true,nullable = false,length = 50)
    String username;
    String password; //TODO hash password
    String bio;
    String image;

    @ManyToMany
    List<ArticleEntity> liked_by;

    @ManyToMany
    @JoinTable(
            name = "user_following",
            joinColumns = @JoinColumn(name = "follower_id"),
            inverseJoinColumns = @JoinColumn(name = "followee_id")
    )
    List<UserEntity> following;

    @ManyToMany
    List<UserEntity> followers;
}
