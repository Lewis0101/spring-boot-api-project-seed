package org.lewis.management.system.mapper;

import org.lewis.management.system.core.Mapper;
import org.lewis.management.system.dto.request.PersonnelInfoReqDTO;
import org.lewis.management.system.model.PersonnelInfo;

public interface PersonnelInfoMapper extends Mapper<PersonnelInfo> {

    PersonnelInfo getBaseInfo(PersonnelInfoReqDTO req);
}