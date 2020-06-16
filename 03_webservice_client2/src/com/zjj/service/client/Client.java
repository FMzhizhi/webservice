package com.zjj.service.client;

import com.zjj.service.WeatherServiceImpl;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8000/weatherService?wsdl");

        QName qname = new QName("http://service.zjj.com/", "WeatherServiceImplService");

        Service service = Service.create(url, qname);
        WeatherServiceImpl port = service.getPort(WeatherServiceImpl.class);
        String query = port.query("大广东");
       // String orther = port.orther("你");
        //System.out.println(orther);
        System.out.println(query);

    }
}
