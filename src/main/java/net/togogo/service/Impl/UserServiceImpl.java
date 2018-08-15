package net.togogo.service.Impl;

import net.togogo.bean.User;
import net.togogo.mapper.UserMapper;
import net.togogo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lingeros
 * @date 18-8-15
 **/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUser(Integer user_id) {
        User user = userMapper.getUser(user_id);
        return user;
    }
}
