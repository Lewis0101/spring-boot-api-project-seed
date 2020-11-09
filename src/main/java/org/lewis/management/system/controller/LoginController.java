package org.lewis.management.system.controller;

import org.lewis.management.system.common.constant.ProjectConstants;
import org.lewis.management.system.common.result.Result;
import org.lewis.management.system.common.result.ResultUtil;
import org.lewis.management.system.common.utils.CookieUtil;
import org.lewis.management.system.common.utils.RedisUtils;
import org.lewis.management.system.core.ProjectConstant;
import org.lewis.management.system.dto.request.UserReqDTO;
import org.lewis.management.system.dto.response.UserResDTO;
import org.lewis.management.system.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Lewis on 2020/11/02.
 *
 * @author :lys
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户登录")
@Slf4j
public class LoginController {
    @Resource
    private UserService userService;

    @Resource
    private RedisUtils redisUtils;


    @GetMapping
    @ApiOperation(notes = "查询用户信息", value = "查询用户信息")
    public Result<UserResDTO> getUserInfo(HttpServletResponse response, @RequestParam("user_name") String username) {
        String s = userService.getUserInfo(username).toString();
        CookieUtil.addCookie(response, username, s, 30);
        return ResultUtil.success(userService.getUserInfo(username));
    }

    @PostMapping
    @ApiOperation(notes = "注册", value = "注册")
    public Result register(@Valid @RequestBody UserReqDTO req) {
        userService.insertUser(req);
        return ResultUtil.success();
    }

    @PostMapping("/login")
    @ApiOperation(notes = "查询用户信息", value = "查询用户信息")
    public Result login(HttpServletResponse response, @Valid @RequestBody UserReqDTO req) {

        if ("".equals(req.getName()) || "".equals(req.getPassword())) {
            try {
                throw new Exception("用户名或者密码为空");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        UserResDTO userInfo = userService.getUserInfo(req.getName());
        if (Objects.isNull(userInfo)) {
            log.info("当前人员未注册！请注册！");
            try {
                throw new Exception("当前人员未注册！请注册！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        CookieUtil.addCookie(response, req.getName(), req.getPassword(), 30);
        //登录信息存入redis
        redisUtils.setKey(ProjectConstants.LOGINFO,userInfo.toString());

        return ResultUtil.success();
    }

    @GetMapping("/logout")
    @ApiOperation(notes = "登出", value = "登出")
    public void getUserInfo(HttpServletRequest request) {
//        CookieUtil.getUid()
    }

}
