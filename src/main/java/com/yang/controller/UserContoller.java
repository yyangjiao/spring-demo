package com.yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("userController")
@RequestMapping("/user")
public class UserContoller {
    @RequestMapping(value = "/selectAll",method = RequestMethod.GET,params = {"username!=yangjiao"})
    public String selectAll(){
        System.out.println("UserContoller.selectAll...");
        // 已经配置了视图处理器前(/jsp/)后(.jsp)缀
        // 实际上返回的是”/jsp/success.jsp"
        return "success";
        // return "forward:/jsp/success.jsp"; //使用了forward:或redirect:前缀之后 不会对请求url进行前后缀拼接
    }
    @RequestMapping("/forwardTest")
    public String forwardTest(){
        System.out.println("UserContoller.forwardTest...");
        return "forward:/user/selectAll";
    }
}
