package com.asia.mysharding2.module.account.dao;

import com.asia.mysharding2.module.account.domain.entity.AccountEntity;
import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

@MybatisPlusTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class AccountDaoTest {
    @Autowired
    private AccountDao accountDao;

    @Test
    public void test1() {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setId(1);
        accountEntity.setName("风刀霜剑");
        accountEntity.setAge(100);

        accountDao.insert(accountEntity);
    }
}