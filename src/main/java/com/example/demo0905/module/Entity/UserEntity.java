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
@TableName("sys_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private Long userId;

	private String userName;

	private String password;

	private String salt;

	private String	email;

	private String mobile;

	private Integer	status;

	private LocalDateTime create_time;

	private LocalDateTime update_time;


}
