package com.dubbo.serviceImpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.CustomerService;
import com.dubbo.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Reference
    private DemoService demoService;

    public List<String> customerService(String customerIds) {
        List<String> cusList = new ArrayList<String>();
        cusList.add("liuhaihua");
        cusList.add("zhangsan");
        cusList.add("lisi");
        cusList.add(demoService.sayHello(" dubbo test"));
        return cusList;
    }
}
