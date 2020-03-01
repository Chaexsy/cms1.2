package com.hikvision.ae.cms.platform.api.service;

import java.util.List;

/**
 * 设备服务
 *
 * @author Chaexsy 2020-02-08 21:43
 */
public interface DeviceService {
    List<String> getDevicesByDeveloperAccount(String developerAccount);
}
