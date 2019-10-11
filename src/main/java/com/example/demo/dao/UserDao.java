package com.example.demo.dao;

import com.example.demo.model.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

/**
 * @author zzz
 */
@Mapper
public interface UserDao {
    /**
     * 增加用户
     * @param record
     * @return int
     */
    Boolean insertUser(UserDTO record);

    /**
     * 查询用户
     * @return userList
     */
    ArrayList<UserDTO> selectUsers();
}
