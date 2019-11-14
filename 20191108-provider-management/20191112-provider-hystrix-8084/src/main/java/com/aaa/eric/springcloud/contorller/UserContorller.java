package com.aaa.eric.springcloud.contorller;

import com.aaa.eric.springcloud.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserContorller {

    @Autowired
    private UserService userService;

    @GetMapping("/provider")
    //@HystrixCommand(fallbackMethod = "selectAllUserFallBack")
    public Map<String, Object> selectAllUser() throws Exception {
        Map<String, Object> UserMap = userService.selectAllUser();
        if ("200".equals((String) UserMap.get("code")) && null != UserMap.get("data")) {
            System.out.println("8083");
            throw  new Exception();
        }
        return UserMap;
    }

    /*public Map<String,Object> selectAllUserFallBack(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code","200");
        map.put("msg","测试熔断的后备方法");
        return map;
    }*/
}
