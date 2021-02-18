package com.basic.feign.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: rest测试
 * @author: haokaichao
 * @CreateDate: 2021/2/18  15:42
 **/
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "test;";
    }
}
