package org.lewis.management.system.service;


import org.lewis.management.system.dto.request.UserReqDTO;
import org.lewis.management.system.dto.response.UserResDTO;

/**
 * Created by Lewis on 2020/11/02.
 */
public interface UserService {

    UserResDTO getUserInfo(String username);

    void insertUser(UserReqDTO req);

}
