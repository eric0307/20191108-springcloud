package com.aaa.eric.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *@ClassName ApplicationRun3081
 *@Description
 *@Date 16:03 2019/11/14
 *@author eric
 *        config的分布式配置中心不需要添加任何注解，直接可以用
 *@Param
 *@Return
 **/
@SpringBootApplication
public class ApplicationRun3081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun3081.class,args);
    }
}
