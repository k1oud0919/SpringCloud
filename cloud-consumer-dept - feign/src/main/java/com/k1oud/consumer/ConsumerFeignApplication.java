package com.k1oud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
//这里这个扫描包应该是扫自己的吧，其他的包他也扫不了啊
//我觉得应该是这些微服务共同的包名
@EnableFeignClients(basePackages = {"com.k1oud"})
@ComponentScan("com.k1oud")
public class ConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApplication.class, args);
    }

}
