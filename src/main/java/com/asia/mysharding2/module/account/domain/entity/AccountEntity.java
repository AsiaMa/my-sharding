package com.asia.mysharding2.module.account.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("account")
@Data
public class AccountEntity {
    private Long id;
    private String name;
    private Integer age;
}
