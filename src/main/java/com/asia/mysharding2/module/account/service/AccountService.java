package com.asia.mysharding2.module.account.service;

import com.asia.mysharding2.module.account.dao.AccountDao;
import com.asia.mysharding2.module.account.domain.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public void save() {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setName("风刀霜剑");
        accountEntity.setAge(18);

        accountDao.insert(accountEntity);
    }

    public List<AccountEntity> list() {
        return accountDao.selectList(null);
    }
}
