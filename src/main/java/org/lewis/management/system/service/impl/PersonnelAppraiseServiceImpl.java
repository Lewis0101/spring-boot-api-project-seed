package org.lewis.management.system.service.impl;

import org.lewis.management.system.mapper.PersonnelAppraiseMapper;
import org.lewis.management.system.service.PersonnelAppraiseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by Lewis on 2020/06/09.
 */
@Service
public class PersonnelAppraiseServiceImpl  implements PersonnelAppraiseService {
    @Resource
    private PersonnelAppraiseMapper personnelAppraiseMapper;

}
