package com.heima.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author SaddyFire
 * @date 2022/1/23
 * @TIME:16:12
 */
@SpringBootApplication
@MapperScan("com.heima.user.mapper")
@EnableDiscoveryClient  //注册到注册中心
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
