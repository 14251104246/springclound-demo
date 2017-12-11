package com.zehua.loadBalancing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 负载均衡微服务
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LoadBalancingApplication {
    /**
     * 实例化RestTemplate，通过@LoadBalanced注解开启均衡负载能力.
     * <p>
     * RestTemplate可以用于调用http请求的WebService
     *
     * @return restTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(LoadBalancingApplication.class, args);
    }
}