package com.example.demo.service;

import com.example.demo.model.UserDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zz
 */
public interface UserService {
    /**
     * 插入用户
     * @param user
     * @return success
     */
    Boolean addUser(UserDTO user);

    /**
     * 获得所有用户信息
     * @param
     * @return  list
     */
    ArrayList<UserDTO> getAllUserList();

    /**
     * 获得符合条件的所有用户信息
     * @param user
     * @return  list
     */
    List<UserDTO> getUserList(UserDTO user);

    /**
     * 获得单个用户
     * @param id
     * @return
     */
    UserDTO getSingleUser(Integer id);
}
