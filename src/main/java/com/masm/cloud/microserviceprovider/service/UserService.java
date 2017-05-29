package com.masm.cloud.microserviceprovider.service;

import com.masm.cloud.microserviceprovider.entity.User;

/**
 * Created by simple on 2017/5/29.
 */
public interface UserService {
    User findById(int id);
}
