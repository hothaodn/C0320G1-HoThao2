package com.codegym.furama_resort.model.userWebsite;

import javax.persistence.*;

//@Entity
//@Table(name="account")
public class Account {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    @Column(name="user_name")
    private String userName;

    public Account() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
