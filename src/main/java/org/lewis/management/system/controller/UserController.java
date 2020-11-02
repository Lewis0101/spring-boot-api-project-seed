package org.lewis.management.system.web;
import org.lewis.management.system.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* Created by Lewis on 2020/11/02.
*/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
}
