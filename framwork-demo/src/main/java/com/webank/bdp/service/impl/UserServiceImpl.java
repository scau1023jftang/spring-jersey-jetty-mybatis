package com.webank.bdp.service.impl;

import com.webank.bdp.domain.User;
import com.webank.bdp.mapper.UserMapper;
import com.webank.bdp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.seletctUserById(id);
    }

    @Override
    public void updateAge(int id, int age) {
        userMapper.updaAgeById(id,age);
    }

}
