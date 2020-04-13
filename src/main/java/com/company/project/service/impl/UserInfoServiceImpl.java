package com.company.project.service.impl;

import com.company.project.dao.UserInfoMapper;
import com.company.project.model.UserInfo;
import com.company.project.service.UserInfoService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Lewis on 2020/04/02.
 */
@Service
@Transactional
public class UserInfoServiceImpl extends AbstractService<UserInfo> implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;

}
