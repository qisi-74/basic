package com.basic.moudle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description: 基本启动类
 * @author: haokaichao
 * @CreateDate: 2021/2/18  15:14
 **/
@SpringBootApplication
//不写basePackages默认为当前包
@EnableFeignClients(basePackages = "com.basic.api")
public class moudleMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(moudleMainApplication.class,args);
    }
}


