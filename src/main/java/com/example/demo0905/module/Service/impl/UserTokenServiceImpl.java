package com.example.demo0905.module.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo0905.module.Dao.UserTokenDao;
import com.example.demo0905.module.Entity.UserTokenEntity;
import com.example.demo0905.module.Service.UserTokenService;
import org.springframework.stereotype.Service;


@Service
public class UserTokenServiceImpl extends ServiceImpl<UserTokenDao, UserTokenEntity> implements UserTokenService {
}
