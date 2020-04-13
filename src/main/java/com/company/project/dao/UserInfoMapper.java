package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.UserInfo;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserInfoMapper extends Mapper<UserInfo> {
    List<UserInfo> getName(Long id);

    @Select("select user_name from user_info")
    List<UserInfo> getName1();

//    List<UserInfo> position();
}