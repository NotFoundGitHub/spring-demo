package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.UserDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zzz
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;


    @Override
    public Boolean addUser(UserDTO user) {
        return null;
    }

    @Override
    public ArrayList<UserDTO> getAllUserList() {
        return userDao.selectUsers();
    }

    @Override
    public List<UserDTO> getUserList(UserDTO user) {
        return null;
    }

    @Override
    public UserDTO getSingleUser(Integer id) {
        return null;
    }
}
