package com.example.demo0905.module.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo0905.module.Dao.UserDao;
import com.example.demo0905.module.Entity.UserEntity;
import com.example.demo0905.module.Service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService{
}
