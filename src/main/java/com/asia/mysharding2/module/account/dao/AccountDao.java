package com.asia.mysharding2.module.account.dao;

import com.asia.mysharding2.module.account.domain.entity.AccountEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountDao extends BaseMapper<AccountEntity> {
}
