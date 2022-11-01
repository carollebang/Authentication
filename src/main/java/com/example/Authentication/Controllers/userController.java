package com.example.Authentication.Controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class userController {

        @RequestMapping("/getname")
        public String   getUserName() {
            return"welcome user ,soon will be requesting your details";
        }


    }


