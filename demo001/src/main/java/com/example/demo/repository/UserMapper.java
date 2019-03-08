package com.example.demo.repository;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int saveUser(User user);
    List<User> selectAllUser(User user);
}
