package com.zjj.service.main;

import com.zjj.service.WeatherServiceImpl;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/weatherService", new WeatherServiceImpl());
    }
}
