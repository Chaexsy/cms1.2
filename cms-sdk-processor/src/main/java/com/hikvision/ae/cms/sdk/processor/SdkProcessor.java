package com.hikvision.ae.cms.sdk.processor;


import com.alibaba.fastjson.JSON;
import com.hikvision.ae.cms.platform.api.service.AuthService;
import com.hikvision.ae.cms.platform.api.service.DeviceService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.MonitorConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.config.utils.ReferenceConfigCache;


import java.util.List;

public class SdkProcessor {

    public static void main(String[] args) {
//        SpringApplication.run(SdkProcessor.class, args);
//
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.properties");
//        context.start();
//        DeviceService deviceService = context.getBean("deviceService", DeviceService.class);
//        List<String> devices = deviceService.getDevicesByDeveloperAccount("world");
//        System.out.println("result: " + Arrays.toString(devices.toArray()));

        ReferenceConfig<DeviceService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setInterface(DeviceService.class);
        referenceConfig.setVersion("1.0.0");

        ReferenceConfig<AuthService> referenceConfig2 = new ReferenceConfig<>();
        referenceConfig2.setInterface(AuthService.class);
        referenceConfig2.setVersion("1.0.0");

        MonitorConfig monitorConfig = new MonitorConfig();
        monitorConfig.setProtocol("registry");

        DubboBootstrap bootstrap = DubboBootstrap.getInstance();
        bootstrap
                .application(new ApplicationConfig("cms-sdk-processor"))
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181"))
                .reference(referenceConfig).reference(referenceConfig2)
                .monitor(monitorConfig)
                .start();

        DeviceService deviceService = ReferenceConfigCache.getCache().get(referenceConfig);
//        AuthService authService = ReferenceConfigCache.getCache().get(referenceConfig2);
        int i = 0;
        while (true){
            try{
                List<String> devices = deviceService.getDevicesByDeveloperAccount("111");
//            List<String> auths = authService.getAllPermissionCodes();
                System.out.println(JSON.toJSONString(devices));
//            System.out.println(JSON.toJSONString(auths));
                System.out.println(++i);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

//        List<String> devices = ReferenceConfigCache.getCache().get(referenceConfig).getDevicesByDeveloperAccount("111");
//        List<String> inters = ReferenceConfigCache.getCache().get(referenceConfig2).getAllPermissionCodes();
//        System.out.println("Device result: " + JSON.toJSONString(devices));
//        System.out.println("Auth result: " + JSON.toJSONString(inters));
    }

}
