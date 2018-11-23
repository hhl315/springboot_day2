package com.kuson.springboot.service;

import com.kuson.springboot.dao.UserDao;
import com.kuson.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    UserDao userDao;
    @Override
    public List<User> queryAll() {
        return userDao.selectAll();
    }

    @Override
    public void save(User user) {
        userDao.insert(user);
    }
}
