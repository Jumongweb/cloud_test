package com.jumong.cloud_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Jumong! /nThis is a test application for Jumong Cloud";
    }

}
