package org.lewis.management.system.service.impl;

import org.lewis.management.system.mapper.SalaryMapper;
import org.lewis.management.system.service.SalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by Lewis on 2020/06/09.
 */
@Service
public class SalaryServiceImpl  implements SalaryService {
    @Resource
    private SalaryMapper salaryMapper;

}
