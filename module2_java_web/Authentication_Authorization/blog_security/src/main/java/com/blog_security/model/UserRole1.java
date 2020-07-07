package com.blog_security.model;

import javax.persistence.*;

@Entity
public class UserRole1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "User_Id", nullable = false)
    private User userId;

    @ManyToOne
    @JoinColumn(name = "Role_Id", nullable = false)
    private Role roleId;

    public UserRole1() {
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}
