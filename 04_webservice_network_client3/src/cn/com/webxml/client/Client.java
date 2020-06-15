package cn.com.webxml.client;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

/**
 * @author zhijiaju
 * @version 1.0
 * @date 2020/6/15 9:09
 */
public class Client {
    public static void main(String[] args) {
        MobileCodeWS service=new MobileCodeWS();
        MobileCodeWSSoap port = service.getPort(MobileCodeWSSoap.class);
        String info = port.getMobileCodeInfo("18988900422", null);
        System.out.println(info);
    }
}
