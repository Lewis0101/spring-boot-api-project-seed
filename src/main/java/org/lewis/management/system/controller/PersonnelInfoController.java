package org.lewis.management.system.controller;
import org.lewis.management.system.core.Result;
import org.lewis.management.system.core.ResultGenerator;
import org.lewis.management.system.model.PersonnelInfo;
import org.lewis.management.system.service.PersonnelInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 员工基本信息
 *
 * @author lewis
 * @date 2020/06/09
 * @since 1.0
 */
@RestController
@RequestMapping("/personnel/info")
@Api(tags = "员工基本信息")
public class PersonnelInfoController {
    @Resource
    private PersonnelInfoService personnelInfoService;

    @PostMapping("/add")
    @ApiOperation("新增员工基本信息")
    public Result add() {
        return ResultGenerator.genSuccessResult();
    }

}
