package org.lewis.management.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lewis[1005859278@qq.com]
 * @date : 2020/11/17
 * @desc :
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "hello";
    }
}
