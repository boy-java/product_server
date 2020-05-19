package com.bear;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author XiaoXiong.Li
 * @Date 20:51 2020/5/19
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.bear.mapper"})
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
