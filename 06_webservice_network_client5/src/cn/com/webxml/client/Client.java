package cn.com.webxml.client;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.EnglishChinese;
import cn.com.webxml.EnglishChineseSoap;

import java.util.List;

/**
 * @author zhijiaju
 * @version 1.0
 * @date 2020/6/15 9:49
 */
public class Client {
    public static void main(String[] args) {
        EnglishChinese service=new EnglishChinese();
        EnglishChineseSoap port = service.getPort(EnglishChineseSoap.class);
        ArrayOfString array = port.translatorString("天气");
        List<String> list = array.getString();
        list.stream().forEach(System.out::println);
    }
}
