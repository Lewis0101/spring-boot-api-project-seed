package org.lewis.management.system.controller;
import org.lewis.management.system.core.Result;
import org.lewis.management.system.core.ResultGenerator;
import org.lewis.management.system.dto.request.PersonnelInfoReqDTO;
import org.lewis.management.system.dto.response.PersonnelInfoResDTO;
import org.lewis.management.system.service.PersonnelAdjustSalaryService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 员工调薪
 *
 * @author lewis[1005859278@qq.com]
 * @date 2020/06/09
 * @since 1.0
 */
@RestController
@RequestMapping("/personnel/adjust/salary")
@Api(tags = "员工调薪")
public class PersonnelAdjustSalaryController {
    @Resource
    private PersonnelAdjustSalaryService personnelAdjustSalaryService;

    @PostMapping("/add")
    @ApiOperation("新增员工基本信息")
    public Result add(@RequestBody PersonnelInfoReqDTO req) {
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/list")
    @ApiOperation("查询员工基本信息")
    public PersonnelInfoResDTO list() {
        return null;
    }


    @DeleteMapping("/delete")
    @ApiOperation("删除员工基本信息")
    public Result delete() {
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    @ApiOperation("更新员工基本信息")
    public Result update() {
        return ResultGenerator.genSuccessResult();
    }
}
