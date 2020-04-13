package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.dao.UserInfoMapper;
import com.company.project.model.UserInfo;
import com.company.project.service.ManageService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author : LiuYang
 * @date : 2020/3/30
 */

@RestController
@RequestMapping("/load")
@Api(value = "TestRestController",description = "接口方法测试")
public class TestRestController {

    @Resource
    private ManageService mService;

    @Resource
    private UserInfoMapper userMapper;

    @GetMapping("/path/{id}")
    @ApiOperation(value = "Get接口跟路径传参")
    public  String getFirst(@PathVariable("id") Integer Id){
        return mService.send(Id);
    }

    @GetMapping("/path")
    @ApiOperation(value = "Get接口参数传参")
    public  String getFirstPath(@RequestParam(value = "id",required = true) Integer Id){
        return mService.send(Id);
    }

    @PostMapping("/user")
    @ApiOperation(value = "获取用户信息")
    public Result<List<UserInfo>> listUser(){
        return ResultGenerator.genSuccessResult(userMapper.selectAll());
    }

    @PostMapping("/name")
    @ApiOperation(value = "获取用户名@select注解")
    public Result<List<UserInfo>> listUserName(){
        return ResultGenerator.genSuccessResult(userMapper.getName1());
    }

    @GetMapping("/name1")
    @ApiOperation(value = "获取用户名")
    public Result<List<UserInfo>> listUserName1(@RequestParam Long id){
        return ResultGenerator.genSuccessResult(userMapper.getName(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "插入用户信息")
    public Result<Integer> insertInfos(@RequestBody UserInfo req){
        int sum = 0;
        for (int i = 2;i<10;i++){
            req.setUserId(Long.valueOf(i));
            req.setCreateTime(new Date(System.currentTimeMillis()));
            int insert = userMapper.insert(req);
            sum += insert;
        }
        return ResultGenerator.genSuccessResult(sum);
    }
}
