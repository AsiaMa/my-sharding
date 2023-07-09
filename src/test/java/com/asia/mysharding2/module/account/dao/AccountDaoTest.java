package com.asia.mysharding2.module.account.dao;

import com.asia.mysharding2.module.account.domain.entity.AccountEntity;
import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.time.LocalDateTime;

@MybatisPlusTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class AccountDaoTest {
    @Autowired
    private AccountDao accountDao;

    @Test
    public void test1() {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setId(1L);
        accountEntity.setName("风刀霜剑");
        accountEntity.setAge(100);
        accountEntity.setCreateDate(LocalDateTime.now());
//        accountEntity.setUpdateDate(LocalDateTime.now());

        accountDao.insert(accountEntity);
    }
}