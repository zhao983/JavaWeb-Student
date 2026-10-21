package org.example.day05springbootweb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResponseExtractor;

import java.io.IOException;

@RestController
public class ResponseController {
    //方式一：HttpServletResponse设置响应数据
    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws Exception {
        //1.设置响应状态码（一般不设置）
//        response.setStatus(401);

        //2.设置响应头
        response.setHeader("name","itjava");

        //3.设置响应体
        response.getWriter().write("<h1>hello</h1>");

    }
    //方式二：ResponseEntity设置响应数据
    @RequestMapping("/response2")
    public ResponseEntity<String> responseExtractor(){
        return ResponseEntity
                .status(401)  //1.设置响应状态码（一般不设置）
                .header("name","javaWeb")   //2.设置响应头
                .body("<h1>hello</h1>");  //3.设置响应体
    }

}
