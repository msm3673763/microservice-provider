package com.masm.cloud.microserviceprovider.service.impl;

import com.masm.cloud.microserviceprovider.dao.UserMapper;
import com.masm.cloud.microserviceprovider.entity.User;
import com.masm.cloud.microserviceprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by simple on 2017/5/29.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
}
