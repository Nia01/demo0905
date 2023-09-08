package com.example.demo0905.module.controller.form;


import com.baomidou.mybatisplus.annotation.TableId;
import com.example.demo0905.module.Entity.UserEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RegisterForm {

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("密码")
    private String password;

}
