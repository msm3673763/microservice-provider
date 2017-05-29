package com.masm.cloud.microserviceprovider.dao;

import com.masm.cloud.microserviceprovider.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by simple on 2017/5/29.
 */
@Mapper
public interface UserMapper {

    User findById(@Param("id") int id);
}
