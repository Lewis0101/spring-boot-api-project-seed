package org.lewis.management.system.service.impl;

import org.lewis.management.system.mapper.PersonnelEncouragementMapper;
import org.lewis.management.system.service.PersonnelEncouragementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by Lewis on 2020/06/09.
 */
@Service
public class PersonnelEncouragementServiceImpl implements PersonnelEncouragementService {
    @Resource
    private PersonnelEncouragementMapper personnelEncouragementMapper;

}
