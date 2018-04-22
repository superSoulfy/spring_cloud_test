package com.example.demo.property_test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by soulfy on 2018/1/26.
 * 获取yml配置数据的样例
 * 步骤：
 * ①在yml中配置属性
 * ②在类中使用@ConfigurationProperties注解类并将yml中定义的属性对应声明到类的属性成员
 */
@Profile("node1")//在节点1的服务实例中启用此类
@Component
@ConfigurationProperties(prefix = "myProp")//@ConfigurationProperties 用于指定yml中的一组配置数据集合
public class YmlReadDemo {

    private String str;
    private int[] arrInt;
    private List<Map<String, String>> listP;
    private List<String> listP2;
    private Map<String, String> mapP;

    public List<Map<String, String>> getListP() {
        return listP;
    }

    public void setListP(List<Map<String, String>> listP) {
        this.listP = listP;
    }

    public List<String> getListP2() {
        return listP2;
    }

    public void setListP2(List<String> listP2) {
        this.listP2 = listP2;
    }

    public Map<String, String> getMapP() {
        return mapP;
    }

    public void setMapP(Map<String, String> mapP) {
        this.mapP = mapP;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int[] getArrInt() {
        return arrInt;
    }

    public void setArrInt(int[] arrInt) {
        this.arrInt = arrInt;
    }
}
