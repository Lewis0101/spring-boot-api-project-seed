package org.lewis.management.system.mapper;

import org.lewis.management.system.core.Mapper;
import org.lewis.management.system.model.User;

public interface UserMapper extends Mapper<User> {

    User getUserInfos(String username);
}