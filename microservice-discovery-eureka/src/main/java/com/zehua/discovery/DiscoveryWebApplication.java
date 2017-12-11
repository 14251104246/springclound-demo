package com.zehua.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 基于Eureka的服务发现
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryWebApplication.class, args);
    }
}
