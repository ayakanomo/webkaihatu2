package com.example.demo2.domain;

public class User {
    private String name;
    private String comment;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public User(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    
}
