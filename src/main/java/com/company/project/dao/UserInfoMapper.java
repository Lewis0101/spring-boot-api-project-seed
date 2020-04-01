package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.UserInfo;

import org.apache.ibatis.annotations.Select;

public interface UserInfoMapper extends Mapper<UserInfo> {
    @Select("select * from user_info")
    UserInfo findPerson();
}