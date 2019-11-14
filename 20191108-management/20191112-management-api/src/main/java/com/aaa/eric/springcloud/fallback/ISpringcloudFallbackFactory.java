package com.aaa.eric.springcloud.fallback;

import com.aaa.eric.springcloud.service.ISpringcloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class ISpringcloudFallbackFactory implements FallbackFactory<ISpringcloudService> {
    public ISpringcloudService create(Throwable throwable) {
        return new ISpringcloudService() {
            public Map<String, Object> selectAllUser() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("code","200");
                map.put("msg","我是测试熔断的后备方法");
                System.out.println("我是测试熔断的后备方法");
                return map;

            }
        };
    }
}
