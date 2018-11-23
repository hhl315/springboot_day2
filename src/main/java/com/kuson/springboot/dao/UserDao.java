package com.kuson.springboot.dao;

import com.kuson.springboot.entity.User;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
    void insert(User user);
}
