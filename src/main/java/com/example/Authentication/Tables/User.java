package com.example.Authentication.Tables;

import org.hibernate.annotations.Tables;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    private String Names;
    private Integer password;
    public User() {}

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}

