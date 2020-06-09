package org.lewis.management.system.service.impl;

import org.lewis.management.system.mapper.PersonnelInfoMapper;
import org.lewis.management.system.service.PersonnelInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by Lewis on 2020/06/09.
 */
@Service
public class PersonnelInfoServiceImpl  implements PersonnelInfoService {
    @Resource
    private PersonnelInfoMapper personnelinfoMapper;

}
