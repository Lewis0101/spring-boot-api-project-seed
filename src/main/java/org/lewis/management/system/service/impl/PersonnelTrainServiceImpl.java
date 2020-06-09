package org.lewis.management.system.service.impl;

import org.lewis.management.system.mapper.PersonnelTrainMapper;
import org.lewis.management.system.service.PersonnelTrainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by Lewis on 2020/06/09.
 */
@Service
public class PersonnelTrainServiceImpl implements PersonnelTrainService {
    @Resource
    private PersonnelTrainMapper personnelTrainMapper;

}
