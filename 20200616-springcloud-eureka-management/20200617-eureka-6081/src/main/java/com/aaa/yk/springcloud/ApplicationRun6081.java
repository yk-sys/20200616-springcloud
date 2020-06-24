package com.aaa.yk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Param
 * @ClassName ApplicationRun6081
 * @Description TODO
 * @Author yk
 * @Date 2020/6/18 0018 14:41
 * @Return
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun6081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6081.class,args);
    }
}
