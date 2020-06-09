package org.lewis.management.system.service.impl;

import org.lewis.management.system.mapper.PersonnelAdjustSalaryMapper;
import org.lewis.management.system.service.PersonnelAdjustSalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by Lewis on 2020/06/09.
 */
@Service
public class PersonnelAdjustSalaryServiceImpl  implements PersonnelAdjustSalaryService {
    @Resource
    private PersonnelAdjustSalaryMapper personnelAdjustSalaryMapper;

}
