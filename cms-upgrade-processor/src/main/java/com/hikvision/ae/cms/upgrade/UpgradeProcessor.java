package com.hikvision.ae.cms.upgrade;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 升级请求处理器
 *
 * @author Chaexsy 2020-02-24 15:46
 */
//@EnableAutoConfiguration
@SpringBootApplication
//@EnableDubbo
public class UpgradeProcessor {
    public static void main(String[] args) {
        SpringApplication.run(UpgradeProcessor.class, args);
    }
}
