package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private CustomerService customerService;


    @ResponseBody
    @RequestMapping("/getCusList")
    public List<String> getCusList(@RequestParam("cusId") String cusId) {

        return customerService.customerService(cusId);
    }


}
