package com.tingnichui.mapper;

import com.tingnichui.pojo.po.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Tingnichui
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2022-09-23 21:22:52
* @Entity com.tingnichui.pojo.po.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




