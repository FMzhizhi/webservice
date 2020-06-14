package com.zjj.service;

import javax.jws.WebService;

@WebService
public class WeatherServiceImpl implements IWeatherService {
    @Override
    public String query(String cityname) {
        System.out.println("查询"+cityname);
        return "大晴天";
    }

    @Override
    public String orther(String orther) {
        return "你好啊";
    }
}
