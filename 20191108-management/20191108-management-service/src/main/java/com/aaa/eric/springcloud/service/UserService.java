package com.aaa.eric.springcloud.service;

import com.aaa.eric.springcloud.mapper.UserMapper;
import com.aaa.eric.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Map<String,Object> selectAllUser(){
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        List<User> users = userMapper.selectAll();
        if (users.size()>0){
            resultMap.put("code","200");
            resultMap.put("data",users);
        }else {
            resultMap.put("code", "400");
            resultMap.put("msg", "用户不存在");
        }
        return resultMap;
    }
}
