package com.basic.feign.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @author: haokaichao
 * @CreateDate: 2021/2/19  15:20
 **/
@RequestMapping("/api/feign")
@RestController
public class FeignApiController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String index(){
        return "test success!";
    }
}
