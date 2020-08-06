package org.lewis.management.system.common.utils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/8/6
 */
@Component
public class RedisUtils {

    @Resource
    private RedisTemplate redisTemplate;

    public void setKey(String name,String key){
        redisTemplate.opsForValue().set(name,key);

    }
}
