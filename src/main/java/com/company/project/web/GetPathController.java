package com.company.project.web;

import com.company.project.service.ManageService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : LiuYang
 * @date : 2020/3/30
 */

@RestController
@RequestMapping("/load")
public class GetPathController {

    @Resource
    private ManageService mService;

    @GetMapping("/path")
    public  String getFirst(){
        return mService.send();
    }
}
