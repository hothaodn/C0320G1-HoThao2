package com.meomeo.blog_application_mini_project.model;

import javax.persistence.*;

@Entity
@Table(name="blog_posts")
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private int id;

    @Column(name="title",nullable = false)
    private String title;

//    @ManyToOne
//    @JoinColumn(name="userName")
//    private User user;

    @Column(name="user_name",nullable = true)
    private String userName;

    @Column(name="date_writing",nullable = false)
    private String dateWriting;

    @Column(name="content",nullable = true,length = 2147483647)
    private String content;

    @Column(name="avatar_src",nullable = true)
    private String avatar_src;

    public BlogPost() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDateWriting() {
        return dateWriting;
    }

    public void setDateWriting(String dateWriting) {
        this.dateWriting = dateWriting;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar_src() {
        return avatar_src;
    }

    public void setAvatar_src(String avatar_src) {
        this.avatar_src = avatar_src;
    }
}
