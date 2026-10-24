package org.example.day05springbootweb;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    //获取请求数据
    @RequestMapping("/request")
    public String request(HttpServletRequest request){
        //1.获取请求方式
        String methon = request.getMethod();
        System.out.println("请求方式:"+methon);

        //2.获得url地址
        String url = String.valueOf(request.getRequestURL());
        System.out.println("url地址:"+url);  //http://localhost:8080/request

        String uri = request.getRequestURI();
        System.out.println("uri地址:"+uri);  //request

        //3.获得请求协议
        String protocol = request.getProtocol();
        System.out.println("请求协议:"+protocol);

        //4.获取请求参数name
        String name = request.getParameter("name");
        System.out.println("参数name:"+name);
        String age = request.getParameter("age");
        System.out.println("参数age:"+age);

        //5.获取请求头
        String accept =request.getHeader("Accept");
        System.out.println("请求头："+accept);

        return "OK";
    }
}
