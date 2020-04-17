package com.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String s) {
        return "sayHi" + s;
    }
}
