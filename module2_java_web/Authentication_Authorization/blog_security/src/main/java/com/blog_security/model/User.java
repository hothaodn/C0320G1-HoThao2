package com.blog_security.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String password;



    public Long getUserId() {
        return userId;
    }

    public User() {
    }

    public User(Long userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }


    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public User(String userName, String password, List<GrantedAuthority> grantList) {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
