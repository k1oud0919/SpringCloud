package com.k1oud.consumer.controller.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBeans {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
