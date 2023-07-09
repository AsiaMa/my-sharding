package com.asia.mysharding2.module.account.controller;

import com.asia.mysharding2.module.account.domain.entity.AccountEntity;
import com.asia.mysharding2.module.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/save")
    public String save() {
        accountService.save();
        return "ok";
    }

    @GetMapping("/list")
    public List<AccountEntity> list() {
        return accountService.list();
    }
}
