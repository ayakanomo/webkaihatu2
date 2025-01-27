package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Item;
import com.example.demo2.domain.User;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/first")

public class Ex16Controller {

    @Autowired
    private ServletContext application;

    @RequestMapping("")
    public String index(){
        List<User> userlist =(List<User>) application.getAttribute("userlist");

        if (userlist == null) {
            userlist = new ArrayList<>();
            application.setAttribute("userList", userlist);
        }

        return "ex-16";
    }

    @RequestMapping("/second")
    public String post(String name, String comment){
        User newUser = new User(name, comment);
        
        List<User> userlist =(List<User>) application.getAttribute("userlist");
        userlist.add(newUser);

        application.setAttribute("userlist", userlist);
        return "ex-16";
    }
}
