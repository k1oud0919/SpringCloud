package com.k1oud.consumer.beans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBeans {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    //@LoadBalanced
    public IRule rule (){
        //return new RandomRule();
        //此rule默认round robin，一定时间内检测到死结点，就智能跳过此节点
        return new RetryRule();
    }
}
