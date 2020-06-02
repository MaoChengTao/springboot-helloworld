package com.atguigu.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootConfiguration // 等价于 @Configuration 相当于一个配置类。一个配置类相当于一个XML配置文件
public class AppConfig {
    // 加载属性配置信息，将以 spring.datasource 前缀的属性注入到 DruidDataSource 对象中
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }
}
