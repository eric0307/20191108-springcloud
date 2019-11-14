package com.aaa.eric.springcloud.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContorller {

    @Value("${server.port}")
    private String port;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${mybatis.type-aliases-package}")
    private String aliasesPackage;

    @RequestMapping("/test")
    public String test(){
        return port+"-----------"+driverClassName+"---------"+aliasesPackage;
    }

}
