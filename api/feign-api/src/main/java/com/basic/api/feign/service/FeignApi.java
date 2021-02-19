package com.basic.api.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @Description: java类作用描述
 * @author: haokaichao
 * @CreateDate: 2021/2/19  15:28
 **/
@FeignClient(
        name = "feign-service",
        path = "/api/feign"
)
public interface FeignApi {
    @GetMapping("/test")
    public String test();
}

