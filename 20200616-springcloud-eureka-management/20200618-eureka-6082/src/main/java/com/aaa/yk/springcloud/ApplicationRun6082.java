package com.aaa.yk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Param
 * @ClassName ApplicationRun6082
 * @Description TODO
 * @Author yk
 * @Date 2020/6/18 0018 15:08
 * @Return
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun6082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class,args);
    }
}
