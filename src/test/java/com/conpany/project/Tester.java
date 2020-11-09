//package com.conpany.project;
//
//
//
//import org.junit.Test;
//import org.lewis.management.system.Application;
//import org.junit.runner.RunWith;
//import org.lewis.management.system.common.utils.RedisUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// * 单元测试继承该类即可
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Application.class)
//@Transactional
//@Rollback
//public abstract class Tester {
//
//    @Autowired
//    private RedisUtils redisUtils;
//
//    @Test
//    public void redis(){
//        redisUtils.setKey("name","lys");
//        System.out.println(redisUtils.get("name"));
//    }
//}
//
//
//
