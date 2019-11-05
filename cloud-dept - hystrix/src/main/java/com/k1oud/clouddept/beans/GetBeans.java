package com.k1oud.clouddept.beans;


import com.k1oud.dept.entity.Dept;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetBeans {

    @Bean
    public Dept getDept(){
        return new Dept();
    }
}
