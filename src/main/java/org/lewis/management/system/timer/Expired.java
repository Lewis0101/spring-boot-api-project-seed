package org.lewis.management.system.timer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

/**
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/10/13
 */
@Component
public class Expired implements CommandLineRunner {

    private ScheduledExecutorService scheduledExecutor;


    @PostConstruct
    private void init(){
        scheduledExecutor = Executors.newSingleThreadScheduledExecutor();
    }

    @Override
    public void run(String... strings) throws Exception {
        scheduledExecutor.scheduleWithFixedDelay(this::print,10,100, TimeUnit.DAYS);
    }

    private void print(){
//        System.out.println("ScheduleExecutor");
    }
}
