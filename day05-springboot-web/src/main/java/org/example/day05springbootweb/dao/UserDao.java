package org.example.day05springbootweb.dao;

import java.util.ArrayList;

/**
 * 加载用户数据
 * */
public interface UserDao {
    public ArrayList<String> findAll();
}
