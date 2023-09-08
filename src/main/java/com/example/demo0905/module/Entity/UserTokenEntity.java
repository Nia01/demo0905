package com.example.demo0905.module.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
* 
* @author nia
 * @Date ${time} ${date}
**/
@Data
@TableName("sys_token")
public class UserTokenEntity implements Serializable {
	private static final long serialVersionUID = 1L;


	@TableId
	private Long id;

	private Long userId;

	private String token;

	private LocalDateTime expireTime;

	private LocalDateTime updateTime;

}
