package com.aaa.eric.springcloud.contorller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.Map;


@RestController
public class UserContorller {

    //服务端地址
    private static final String REST_URL_PREFIX = "http://localhost:8081";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public Map<String, Object> selectAllUser() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider", Map.class);
    }





    }

