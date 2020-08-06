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
    private RedisTemplate<String,Object> redisTemplate;

    /**
     * 添加String
     * @param name
     * @param key
     */
    public void setKey(String name,String key){
        redisTemplate.opsForValue().set(name,key);

    }

    /**
     * 返回key对应值
     * @param key
     * @return
     */
    public String get(String key){
        return String.valueOf(redisTemplate.opsForValue().get(key));
    }

}
