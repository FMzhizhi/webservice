package com.zjj.client;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.ServiceClient;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhijiaju
 * @version 1.0
 * @date 2020/6/15 17:40
 */
public class Client {

    private static final String SERVICECLIENTURL="http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?WSDL";

    private static final String NAMESPACEURI="http://WebXml.com.cn/";

    private static final String LOACLPART="MobileCodeWS";


    public static void main(String[] args) {
        String str = serviceMsg("13118849886", null);
        String res = null;
        ServiceClient sc = null;
        try {
            sc = new ServiceClient(null, new URL(SERVICECLIENTURL),null, null);
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }

//
//        <?xml version="1.0" encoding="utf-8"?>
//        <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
//          <soap:Body>
//            <getMobileCodeInfo xmlns="http://WebXml.com.cn/">
//              <mobileCode>string</mobileCode>
//              <userID>string</userID>
//            </getMobileCodeInfo>
//          </soap:Body>
//        </soap:Envelope>

    private static String serviceMsg(String destPhone,String userID){
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sb.append("<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">");
        sb.append("  <soap:Body>");
        sb.append("    <getMobileCodeInfo xmlns=\"http://WebXml.com.cn/\">");
        sb.append("      <mobileCode>"+destPhone+"</mobileCode>");
        sb.append("      <userID>"+userID+"</userID>");
        sb.append("    </getMobileCodeInfo>");
        sb.append("   </soap:Body>");
        sb.append("</soap:Envelope>");
        return sb.toString();
    }

    @Test
    public void test1(){
        String msg = serviceMsg("13118849886", null);
        System.out.println(msg);
    }
}
