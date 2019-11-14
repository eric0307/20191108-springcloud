package com.aaa.eric.springcloud.controller;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@RestController
public class UserContorller {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;


//    @Autowired
//    private DiscoveryClient discoveryClient;
    @GetMapping("/consumer")
    public Map<String,Object> selectAllUser(){
        //List<ServiceInstance> instances = discoveryClient.getInstances("user-provider");
        //ServiceInstance instance = instances.get(0);
        //"http://"+instance.getHost()+":"+instance.getPort()+"/provider"
        //

        return restTemplate.getForObject("http://USER-PROVIDER/provider",Map.class);
    }
    @GetMapping("/consumerLB")
    public Map<String,Object> selectAllUserByLoadBalancer(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("USER-PROVIDER");
        String host = serviceInstance.getHost();
        System.out.println(host);
        int port = serviceInstance.getPort();
        System.out.println(port);
        return restTemplate.getForObject("http://"+host+":"+port+"/provider",Map.class);
    }
}
