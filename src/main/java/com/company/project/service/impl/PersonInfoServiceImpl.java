package com.company.project.service.impl;

import com.company.project.dao.PersonInfoMapper;
import com.company.project.model.PersonInfo;
import com.company.project.service.PersonInfoService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LiuYang on 2020/03/30.
 */
@Service
@Transactional
public class PersonInfoServiceImpl extends AbstractService<PersonInfo> implements PersonInfoService {
    @Resource
    private PersonInfoMapper personInfoMapper;

}
