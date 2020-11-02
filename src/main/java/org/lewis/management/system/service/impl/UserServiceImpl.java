package org.lewis.management.system.service.impl;

import org.lewis.management.system.dto.request.UserReqDTO;
import org.lewis.management.system.dto.response.UserResDTO;
import org.lewis.management.system.mapper.UserMapper;
import org.lewis.management.system.model.User;
import org.lewis.management.system.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;



/**
 * Created by Lewis on 2020/11/02.
 */
@Service
public class UserServiceImpl  implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public UserResDTO getUserInfo(String username) {
        User users = userMapper.getUserInfos(username);
        UserResDTO userRes = new UserResDTO();
        BeanUtils.copyProperties(users,userRes);
        return userRes;
    }

    @Override
    public void insertUser(UserReqDTO req) {
        userMapper.insertUser(req);
    }
}
