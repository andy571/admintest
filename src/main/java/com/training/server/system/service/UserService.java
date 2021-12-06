package com.training.server.system.service;

import com.training.server.system.dto.UserDto;
import com.training.server.system.entity.User;
import com.training.server.system.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author andy
 * @date 2021/12/6
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Object queryAll() {


        return null;
    }

    public UserDto findById(long id) {
        User user = userMapper.selectByPrimaryKey(id).orElseGet(User::new);

//        return userMapper.toDto(user);


        return null;
    }

    public void create(User user) {


    }

    public void update(User user) {



    }

    public UserDto findByName(String userName) {


return null;
    }

}
