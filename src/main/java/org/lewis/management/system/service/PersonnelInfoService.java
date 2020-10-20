package org.lewis.management.system.service;


import org.lewis.management.system.dto.request.PersonnelInfoReqDTO;
import org.lewis.management.system.dto.response.PersonnelInfoResDTO;
import org.lewis.management.system.model.PersonnelInfo;


/**
 * Created by Lewis on 2020/06/09.
 */
public interface PersonnelInfoService  {

    /**
     * 获取员工基本信息
     * @param req
     * @return
     */
   PersonnelInfoResDTO getBaseInfo(PersonnelInfoReqDTO req);

   void save(PersonnelInfoReqDTO req);

}
