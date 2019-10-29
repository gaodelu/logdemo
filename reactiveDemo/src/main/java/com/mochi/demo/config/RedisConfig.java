package com.mochi.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializationContext;

/**
 * @Author Mochi
 * @Description TODO
 * @Date 2019/10/29 15:24
 * @Name RedisConfig
 */
@Configuration
public class RedisConfig {


    /*@Bean(name = "RedisConfig")
    public ReactiveRedisConnectionFactory reactiveRedisConnectionFactory() {
        return new LettuceConnectionFactory();
    }
*/
    @Bean
    ReactiveRedisTemplate<String, String> reactiveRedisTemplate(ReactiveRedisConnectionFactory factory) {
        return new ReactiveRedisTemplate<>(factory, RedisSerializationContext.string());
    }

  /*  @Bean
    ReactiveRedisTemplate<String,String> redisOperations(ReactiveRedisConnectionFactory factory){

    }
*/
}
