package org.lewis.management.system.service.impl;

import org.lewis.management.system.mapper.UserMapper;
import org.lewis.management.system.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Lewis on 2020/11/02.
 */
@Service
@Transactional
public class UserServiceImpl  implements UserService {
    @Resource
    private UserMapper userMapper;

}
