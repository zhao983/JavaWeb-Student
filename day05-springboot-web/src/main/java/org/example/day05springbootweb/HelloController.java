package org.example.day05springbootweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //表明该类是一个请求处理类
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println("hello"+name);
        return "hello"+"\t"+name;
    }

}
