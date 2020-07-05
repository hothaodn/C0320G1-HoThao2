package com.meomeo.blog_application_mini_project.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="first_name")
//    @NotEmpty(message = "Must be not null")
//    @Size(min=5,max=45,message="Must be 6-45 characters")
    private String firstName;

    @Column(name="last_name")
//    @NotEmpty(message = "Must be not null")
//    @Size(min=5,max=45,message="Must be 6-45 characters")
    private String lastName;

    @Column(name="age",nullable = true)
    private String age;

    @Column(name="user_name",nullable = false)
    private String userName;

    @Column(name="password")
//    @NotEmpty(message = "Must be not null")
//    @Size(min=3,message="Must be 3 characters at least")
    private String password;

    private String rePassword;

    @Column(name="email",nullable = false)
    private String email;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
