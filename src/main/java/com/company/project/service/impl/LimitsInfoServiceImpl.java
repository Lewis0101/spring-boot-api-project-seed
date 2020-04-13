package com.company.project.service.impl;

import com.company.project.dao.LimitsInfoMapper;
import com.company.project.model.LimitsInfo;
import com.company.project.service.LimitsInfoService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Lewis on 2020/04/02.
 */
@Service
@Transactional
public class LimitsInfoServiceImpl extends AbstractService<LimitsInfo> implements LimitsInfoService {
    @Resource
    private LimitsInfoMapper limitsInfoMapper;

}
