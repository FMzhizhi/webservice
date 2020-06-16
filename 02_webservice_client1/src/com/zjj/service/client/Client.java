package com.zjj.service.client;

import com.zjj.service.WeatherServiceImpl;
import com.zjj.service.WeatherServiceImplService;

public class Client {
    public static void main(String[] args) {
        //创建服务视图(service标签的name获得)
        WeatherServiceImplService service=new WeatherServiceImplService();
        //获取服务的实现类（porttype标签的name获得）
        WeatherServiceImpl servicePort = service.getPort(WeatherServiceImpl.class);
        //调用方法 （porttype标签的operation获得）
        String result = servicePort.query("广州");
        //String orther = servicePort.orther("你好");
        //System.out.println(orther);
        System.out.println(result);


    }
}
