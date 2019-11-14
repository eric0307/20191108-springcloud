package com.aaa.eric.springcloud.contorller;

import com.aaa.eric.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class UserContorller {
    @Autowired
    private UserService userService;

    @GetMapping("/provider")
    public Map<String, Object> selectAllUser() {
        Map<String, Object> UserMap = userService.selectAllUser();
        if ("200".equals((String) UserMap.get("code")) && null != UserMap.get("data")) {
            System.out.println("8083");
            return UserMap;
            }
        return null;
        }

    }

