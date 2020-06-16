package com.zjj.client;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/weatherService");
        //创建连接对象
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //打开通信
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type","text/xml;charset=utf-8");
        connection.setDoInput(true);
        connection.setDoOutput(true);
        //发送信息
        String info=buildXml("深圳");
        connection.getOutputStream().write(info.getBytes());

        int code = connection.getResponseCode();
        System.out.println(code);
        if (code==200){
            InputStream stream = connection.getInputStream();
            Scanner scanner=new Scanner(stream);
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }
        }else {
            System.out.println("调用失败");
        }

    }

    private static String buildXml(String name) {
        StringBuilder sb=new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sb.append("<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">");
        sb.append("<S:Body><ns2:query xmlns:ns2=\"http://service.zjj.com/\">");
        sb.append("<arg0>"+name+"</arg0>");
        sb.append("</ns2:query>");
        sb.append("</S:Body>");
        sb.append("</S:Envelope>");

        String str="<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
                "<S:Body><ns2:query xmlns:ns2=\"http://service.zjj.com/\">" +
                "<arg0>"+name+"</arg0>" +
                "</ns2:query>" +
                "</S:Body>" +
                "</S:Envelope>";
        return sb.toString();
    }
}
