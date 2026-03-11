package com.joshi.controller;

import com.joshi.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMail {

    @Autowired
    private EmailService emailService;
    @GetMapping("/mail")
    public String sendMail() {
        emailService.sendNotification(
                "",
                "Email Service Implementation",
          "");
        return "Mail Sent";
    }
}
