package com.example.ribbon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired  
    private LoadBalancerClient loadBalancerClient;  

    @GetMapping(value = "/calla")
    public String calla() {
    	this.loadBalancerClient.choose("service-A");
        return restTemplate.getForEntity("http://service-A/hello",String.class).getBody();
    	
    }
    
}