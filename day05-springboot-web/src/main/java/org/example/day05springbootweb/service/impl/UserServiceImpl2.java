package org.example.day05springbootweb.service.impl;

import org.example.day05springbootweb.dao.UserDao;
import org.example.day05springbootweb.pojo.User;
import org.example.day05springbootweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Primary  //能提高注入的优先级
@Service
//@Component  //将该类交给IOC容器管理
public class UserServiceImpl2 implements UserService {
    //依赖注入的三种方式
    //方式一：属性注入
//    @Autowired  //应用运行时会自动查找该类型的bean对象，并赋值给该成员变量
//    private UserDao userDao;

    //方式二：构造器注入
//    private UserDao userDao;
//    @Autowired
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    //方式三：set方法注入
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAll() {
        ArrayList<String> list = userDao.findAll();
        List<User> userList = list.stream().map(line -> {
            String[] lines = line.split(",");
            Integer id = Integer.valueOf(lines[0]);
            String username = lines[1];
            String password = lines[2];
            String name = lines[3];
            Integer age = Integer.valueOf(lines[4]);
            LocalDateTime updata = LocalDateTime.parse(lines[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            //将这些解析后的数据返回到一个新的User对象中去
            return new User(id + 200, username, password, name, age, updata);
        }).toList();
        return userList;
    }
}
