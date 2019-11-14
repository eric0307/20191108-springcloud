package com.aaa.eric.springcloud.config;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    @Bean
    //ribbon提供的负载均衡的注解
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }



    /*@Bean
    public RandomRule randomRule() {
        return new RandomRule();
    }*/

}
