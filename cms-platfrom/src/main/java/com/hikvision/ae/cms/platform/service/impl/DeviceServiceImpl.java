package com.hikvision.ae.cms.platform.service.impl;

import com.hikvision.ae.cms.platform.api.service.DeviceService;
import org.apache.dubbo.config.annotation.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chaexsy 2020-02-08 22:31
 */
@Service(version = "1.0.0")
public class DeviceServiceImpl implements DeviceService {
    private int times = 0;

    @Override
    public List<String> getDevicesByDeveloperAccount(String developerAccount){
        System.out.println("getDevicesByDeveloperAccount("+developerAccount+"), times:" + ++times);
        return Arrays.asList("13588768509");
    }
}
