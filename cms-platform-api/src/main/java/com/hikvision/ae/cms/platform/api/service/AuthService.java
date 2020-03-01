package com.hikvision.ae.cms.platform.api.service;

import java.util.List;

/**
 * 权限相关
 *
 * @author Chaexsy 2020-02-08 21:43
 */
public interface AuthService {
    List<String> getAllPermissionCodes();

    List<String> getPermissionCodesByDeveloperAccount(String developerAccount);
}
