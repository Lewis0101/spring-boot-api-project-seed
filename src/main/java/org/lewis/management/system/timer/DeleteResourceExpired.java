package org.lewis.management.system.timer;

import org.lewis.management.system.mapper.PersonnelRemoveMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 定时器
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/10/13
 */
@Component
public class DeleteResourceExpired {

    @Resource
    private PersonnelRemoveMapper mMapper;

//    @Scheduled(fixedRate = 2000)
    public void point(){
        System.out.println("开始定时任务1");
        System.out.println(System.currentTimeMillis());
    }
}
