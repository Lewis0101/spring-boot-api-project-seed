package org.lewis.management.system.controller;

import org.lewis.management.system.dto.request.UserReqDTO;
import org.lewis.management.system.dto.response.UserResDTO;
import org.lewis.management.system.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by Lewis on 2020/11/02.
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户登录")
public class LoginController {
    @Resource
    private UserService userService;

    @GetMapping
    @ApiOperation(notes = "查询用户信息", value = "查询用户信息")
    public UserResDTO getUserInfo(@RequestParam("user_name") String username) {
        return userService.getUserInfo(username);
    }

    @PostMapping
    public String register(@Valid @RequestBody UserReqDTO req) {
        userService.insertUser(req);
        return "register success";
    }

}
