package com.example.demo.domain;

import java.time.LocalDate;

public class User {
    private Integer id;
    private String name;
    private LocalDate signIndate;

    public User() {
    }

    public User(String name, LocalDate signIndate) {
        this.name = name;
        this.signIndate = signIndate;
    }

    public User(Integer id, String name, LocalDate signIndate) {
        this.id = id;
        this.name = name;
        this.signIndate = signIndate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getSignIndate() {
        return signIndate;
    }

    public void setSignIndate(LocalDate signIndate) {
        this.signIndate = signIndate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", signIndate=" + signIndate +
                '}';
    }
}
