package com.example.restcontroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.constant.Constable;

@RestController
@RequestMapping("api/user")

public class UserController {

    User user = new User("Bement");

    @GetMapping()
    public String findName() {
        return this.user.getName();
    }

}