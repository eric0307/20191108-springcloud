package com.aaa.eric.springcloud.contorller;

import com.aaa.eric.springcloud.service.ISpringcloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class UserContorller {

    @Autowired
    private ISpringcloudService springcloudService;

    @GetMapping("/consumer")
    public Map<String,Object> selectAllUser(){
        return springcloudService.selectAllUser();
    }


}
