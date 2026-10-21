package org.example.day05springbootweb.dao.impl;

import cn.hutool.core.io.IoUtil;
import org.example.day05springbootweb.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

@Repository
//@Component  //将该类交给IOC容器管理
public class UserDaoImpl implements UserDao {
    @Override
    public ArrayList<String> findAll() {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> list = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());
        return list;
    }
}
