package com.hikvision.ae.cms.sdk.processor.controller;

import com.hikvision.ae.cms.platform.api.service.DeviceService;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


//@RestController
public class TestController {
    //用下面这样指定服务提供者url的方式可以做到服务直连，不经过zookeeper
    //@Reference(interfaceName = "com.czh.api.service.HelloService",url = "dubbo://ip:20880",application = "dubbo-provider",timeout = 3000,version = "${demo.service.version}")
//    @Reference(version = "${dubbo.application.name}")
//    private DeviceService deviceService;

//    @RequestMapping("/test/{name}")
//    public String test(@PathVariable("name") String name) {
//        String result = Arrays.toString(deviceService.getDevicesByDeveloperAccount("").toArray());
//        System.out.println("调用结果：" + result);
//
//        return result;
//    }

}
