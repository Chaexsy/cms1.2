package com.hikvision.ae.cms.platform.service.impl;

import com.hikvision.ae.cms.platform.api.service.AuthService;
import org.apache.dubbo.config.annotation.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chaexsy 2020-02-08 21:59
 */
@Service(version = "1.0.0")
public class AuthServiceImpl implements AuthService {
    @Override
    public List<String> getAllPermissionCodes(){
        System.out.println("getAllPermissionCodes()...");
        return Arrays.asList("preview", "playback", "query_gps", "subscribe");
    }

    @Override
    public List<String> getPermissionCodesByDeveloperAccount(String developerAccount){
        System.out.println("getPermissionCodesByDeveloperAccount("+developerAccount+")");
        return Arrays.asList("preview");
    }
}
