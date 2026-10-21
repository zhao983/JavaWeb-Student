package org.example.day05springbootweb.service;

import org.example.day05springbootweb.pojo.User;

import java.util.List;

/**
 * 查询所有用户信息
 */
public interface UserService {
    public List<User> findAll();
}
