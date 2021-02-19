package com.basic.moudle.controller;

import com.basic.api.feign.service.FeignApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * Description:测试
 * @author haokaichao 2021/2/18 15:22
 */
@Controller
public class IndexController {
    public Logger logger= LoggerFactory.getLogger(this.getClass());
//    @Autowired
//    private FeignApi feignApi;
    @RequestMapping(value = {"", "/", "/index","/test"})
    public String index() {
//        String api=feignApi.test("測試微服务");
        logger.info("访问moudle");
        return "index";
    }
}