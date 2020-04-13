package com.company.project.service.impl;

import com.company.project.dao.RoleInfoMapper;
import com.company.project.model.RoleInfo;
import com.company.project.service.RoleInfoService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Lewis on 2020/04/02.
 */
@Service
@Transactional
public class RoleInfoServiceImpl extends AbstractService<RoleInfo> implements RoleInfoService {
    @Resource
    private RoleInfoMapper roleInfoMapper;

}
