package cn.com.webxml.client;

import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

import java.util.List;

/**
 * @author zhijiaju
 * @version 1.0
 * @date 2020/6/15 9:25
 */
public class Client {
    public static void main(String[] args) {
        WeatherWS service = new WeatherWS();
        WeatherWSSoap wsSoap = service.getPort(WeatherWSSoap.class);
        List<String> list = wsSoap.getWeather("佛山", null).getString();
        list.stream().forEach(System.out::println);
    }
}
