package com.aaa.eric.springcloud.service;

import com.aaa.eric.springcloud.fallback.ISpringcloudFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(value = "USER-PROVIDER",fallbackFactory = ISpringcloudFallbackFactory.class)
public interface ISpringcloudService {

    @GetMapping("/provider")
    Map<String, Object> selectAllUser();
}
