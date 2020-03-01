package com.hikvision.ae.cms.upgrade.controller;

import com.alibaba.fastjson.JSON;
import com.hikvision.ae.cms.platform.api.service.DeviceService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 固件controller
 *
 * @author Chaexsy 2020-02-24 15:48
 */
@RestController
@RequestMapping("firmware")
public class FirmwareController {
    @Reference(version = "1.0.0")
    private DeviceService deviceService;

    @RequestMapping("/device/{account}")
    public String getDevice(@PathVariable("account") String account) {
        System.out.println("参数="+account);
        List<String> deviceCodes = deviceService.getDevicesByDeveloperAccount(account);
        return JSON.toJSONString(deviceCodes);
    }
}
