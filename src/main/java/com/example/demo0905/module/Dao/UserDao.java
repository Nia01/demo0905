package com.example.demo0905.module.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo0905.module.Entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
}
