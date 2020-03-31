package com.company.project.web;

import com.company.project.service.ManageService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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


    @GetMapping("/path/{id}")
    @ApiOperation(value = "Get接口跟路径传参")
    public  String getFirst(@PathVariable("id") Integer Id){
        return mService.send(Id);
    }

    @GetMapping("/path")
    @ApiOperation(value = "Get接口参数传参")
    public  String getFirstPath(@RequestParam("id") Integer Id){
        return mService.send(Id);
    }


}
