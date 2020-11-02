package org.lewis.management.system.controller;
import org.lewis.management.system.dto.response.UserResDTO;
import org.lewis.management.system.service.UserService;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* Created by Lewis on 2020/11/02.
*/
@RestController
@RequestMapping("/user")
public class LoginController {
    @Resource
    private UserService userService;

    @GetMapping
    public UserResDTO getUserInfo(@RequestParam("user_name") String username){
        return userService.getUserInfo(username);
    }

}
