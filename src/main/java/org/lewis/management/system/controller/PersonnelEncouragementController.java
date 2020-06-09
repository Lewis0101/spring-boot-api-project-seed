package org.lewis.management.system.controller;
import org.lewis.management.system.service.PersonnelEncouragementService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* Created by Lewis on 2020/06/09.
*/
@RestController
@RequestMapping("/personnel/encouragement")
public class PersonnelEncouragementController {
    @Resource
    private PersonnelEncouragementService personnelEncouragementService;


}
