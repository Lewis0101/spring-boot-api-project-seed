package org.lewis.management.system.service.impl;

import org.lewis.management.system.common.utils.RedisUtils;
import org.lewis.management.system.dto.request.PersonnelInfoReqDTO;
import org.lewis.management.system.dto.response.PersonnelInfoResDTO;
import org.lewis.management.system.mapper.PersonnelInfoMapper;
import org.lewis.management.system.model.PersonnelInfo;
import org.lewis.management.system.service.PersonnelInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;



import javax.annotation.Resource;



/**
 * Created by Lewis on 2020/06/09.
 */
@Service
public class PersonnelInfoServiceImpl  implements PersonnelInfoService {
    @Resource
    private PersonnelInfoMapper personnelinfoMapper;

    @Resource
    private RedisUtils redisUtils;

    @Override
    public PersonnelInfoResDTO getBaseInfo(PersonnelInfoReqDTO req) {
        PersonnelInfo baseInfo = personnelinfoMapper.getBaseInfo(req);
        PersonnelInfoResDTO res = new PersonnelInfoResDTO();
        BeanUtils.copyProperties(baseInfo,res);
        //测试redis
        redisUtils.setKey(String.valueOf(baseInfo),res.toString());
        return res;
    }
}
