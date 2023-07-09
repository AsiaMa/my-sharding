package com.asia.mysharding2.module.account.controller;

import com.asia.mysharding2.module.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/save")
    public String save() {
        accountService.save();
        return "ok";
    }
}
