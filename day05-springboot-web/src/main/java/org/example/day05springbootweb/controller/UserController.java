package org.example.day05springbootweb.controller;

import cn.hutool.core.io.IoUtil;
import jakarta.annotation.Resource;
import org.example.day05springbootweb.pojo.User;
import org.example.day05springbootweb.service.UserService;
import org.example.day05springbootweb.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户信息Controller
 * */
@RestController
@CrossOrigin
public class UserController {
//    @Qualifier("userServiceImpl") //指定注入的bean的名字(默认就是首字母小写)
//    @Autowired  //应用运行时会自动查找该类型的bean对象，并赋值给该成员变量
//    private UserService userService;

    @Resource(name="userServiceImpl")
    private UserService userService;

    @RequestMapping("/list")
    public List<User> list() throws Exception {
        //1.加载并读取user.txt文件，获取洪湖数据
        //需要绝对路径，并不推荐
//        FileInputStream in = new FileInputStream("D:\\Code\\javaWeb\\day05-springboot-web\\src\\main\\resources\\user.txt");
//        ArrayList<String> list = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());
//        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
//        ArrayList<String> list = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());

        //2.解析用户数据，封装为User对象->list集合
        //将集合中的数据再进行分割解析
       /* List<User> userList = list.stream().map(line -> {
            String[] lines = line.split(",");
            Integer id = Integer.valueOf(lines[0]);
            String username = lines[1];
            String password = lines[2];
            String name = lines[3];
            Integer age = Integer.valueOf(lines[4]);
            LocalDateTime updata = LocalDateTime.parse(lines[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            //将这些解析后的数据返回到一个新的User对象中去
            return new User(id, username, password, name, age, updata);
        }).toList();*/

        List<User> userList = userService.findAll();
        //3.返回数据json (如果是对象或集合可以直接返回)
        return userList;

    }
}
