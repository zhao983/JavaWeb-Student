package org.example.day05springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类/引导类
@SpringBootApplication  //默认扫描当前包及其子包
public class Day05SpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day05SpringbootWebApplication.class, args);
    }

}
