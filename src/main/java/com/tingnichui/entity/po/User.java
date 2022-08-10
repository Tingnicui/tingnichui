package com.tingnichui.entity.po;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("t_user")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private String mobile;

    private Timestamp create_time;

    private Timestamp update_time;


}
