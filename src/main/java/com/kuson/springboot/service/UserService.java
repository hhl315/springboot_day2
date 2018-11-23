package com.kuson.springboot.service;

import com.kuson.springboot.entity.User;

import java.util.List;

public interface UserService {

    List<User> queryAll();
    void save(User user);
}
