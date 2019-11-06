package com.k1oud.consumer.beans;

import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigBeans {
/*
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }*/

   /* @Bean
    //@LoadBalanced
    public IRule rule (){
        //return new RandomRule();
        //此rule默认round robin，一定时间内检测到死结点，就智能跳过此节点
        return new RetryRule();
    }*/
}
