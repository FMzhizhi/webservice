package com.zjj.client;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws Exception {
        // URL
        URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?WSDL");
        //创建一个连接对象，用于向服务器发送http请求信息+获取服务器的响应信息
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        //设置请求信息
        connection.setRequestMethod("POST");
        //Content-Type: text/xml; charset=utf-8
        connection.setRequestProperty("Content-Type","text/xml; charset=utf-8");
        //打开通信
        connection.setDoOutput(true);
        connection.setDoInput(true);
        //拼接符合协议要求的数据格式
        String info = serviceMsg("13118849886","");
        //发送请求信息
        connection.getOutputStream().write(info.getBytes());

        //获取响应的消息
        int responseCode = connection.getResponseCode();
        System.out.println(responseCode);
        if (responseCode == 200) {
            //响应状态正常，获取返回的信息
            InputStream inputStream = connection.getInputStream();
            Scanner sc = new Scanner(inputStream);
            while (sc.hasNext()) {
                //输出返回信息
                System.out.println(sc.nextLine());
                //结果：<?xml version="1.0" ?><S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/"><S:Body><ns2:queryResponse xmlns:ns2="http://webservice.lcdiao.cn/"><return>阴天</return></ns2:queryResponse></S:Body></S:Envelope>
            }
            sc.close();
        } else {
            System.out.println(responseCode);
        }
    }

    private static String serviceMsg(String destPhone, String userID) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sb.append("<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">");
        sb.append("  <soap:Body>");
        sb.append("    <getMobileCodeInfo xmlns=\"http://WebXml.com.cn/\">");
        sb.append("      <mobileCode>" + destPhone + "</mobileCode>");
        sb.append("      <userID>" + userID + "</userID>");
        sb.append("    </getMobileCodeInfo>");
        sb.append("   </soap:Body>");
        sb.append("</soap:Envelope>");

        String str="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<string xmlns=\"http://WebXml.com.cn/\">13118849886</string>";

        return sb.toString();
    }
}
