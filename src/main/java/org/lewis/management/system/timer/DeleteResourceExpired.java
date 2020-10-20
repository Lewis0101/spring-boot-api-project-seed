package org.lewis.management.system.timer;

import org.lewis.management.system.mapper.PersonnelRemoveMapper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 定时器 使用的Task--一种较为轻量的Quartz
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/10/13
 */
@Component
/**
 *
 *   开起异步任务，可以使不同的定时任务在不同的线程中执行
 */
@Async
public class DeleteResourceExpired {

    @Resource
    private PersonnelRemoveMapper mMapper;

    @Scheduled(fixedRate = 2000)
    public void point(){
        System.out.println("开始定时任务1--fixedRate");
        System.out.println(System.currentTimeMillis());
    }

    @Scheduled(fixedDelay = 2000)
    public void pre(){
        System.out.println("开始定时任务1--fixedDelay");
        System.out.println(System.currentTimeMillis());
    }

    @Scheduled(initialDelay = 2000,fixedDelay = 2000)
    public void pos(){
        System.out.println("开始定时任务1--initialDelay");
        System.out.println(System.currentTimeMillis());
    }

    @Scheduled(cron = "* */5 * * * *")
    public void exe(){
        System.out.println("开始定时任务1--cron");
        System.out.println(System.currentTimeMillis());
    }
}
