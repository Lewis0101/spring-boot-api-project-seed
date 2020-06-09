package org.lewis.management.system.controller;
import org.lewis.management.system.service.PersonnelAppraiseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* Created by Lewis on 2020/06/09.
*/
@RestController
@RequestMapping("/personnel/appraise")
public class PersonnelAppraiseController {
    @Resource
    private PersonnelAppraiseService personnelAppraiseService;

}
