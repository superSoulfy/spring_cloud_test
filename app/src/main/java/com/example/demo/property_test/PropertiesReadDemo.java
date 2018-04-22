package com.example.demo.property_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by soulfy on 2018/1/26.
 * 获取properties文件配置数据的样例
 * 步骤：
 * ①在properties文件中配置属性
 * ②在类中使用@PropertySource注解，并指定属性文件位置，从而将属性文件中定义的变量注入environment接口中（spring boot 中大多使用Java代码+注解方式配置，其实也可以在xml中实现）
 */
@Profile("node2")//在节点2的服务实例中启用此类
@Configuration//相当spring的配置文件
@PropertySource("classpath:/config/prop.properties")
public class PropertiesReadDemo {
    //使能${‘xxx’}
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
