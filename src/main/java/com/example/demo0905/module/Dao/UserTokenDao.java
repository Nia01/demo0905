package com.example.demo0905.module.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo0905.module.Entity.UserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserTokenDao extends BaseMapper<UserTokenEntity> {
}
