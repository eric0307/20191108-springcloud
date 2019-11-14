package com.aaa.eric.springcloud;

import com.aaa.eric.ribbon.RandomRuleMine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name = "USER-PROVIDER",configuration = {RandomRuleMine.class})
public class ApplicationRun6802 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6802.class,args);
    }
}
