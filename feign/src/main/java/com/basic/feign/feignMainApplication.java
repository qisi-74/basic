package com.basic.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description: 基本启动类
 * @author: haokaichao
 * @CreateDate: 2021/2/18  15:14
 **/
@SpringBootApplication
public class feignMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(feignMainApplication.class,args);
    }
}


