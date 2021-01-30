package com.select.seat.service;

import com.select.seat.entity.Users;

import java.util.List;

public interface UsersService {

    /**
     * 添加数据
     * @param users
     * @return
     */
    Users addUsers(Users users);

    /**
     * 删除数据
     * @param id
     * @return
     */
    void delUsers(int id);

    /**
     * 更新数据
     * @param users
     * @return
     */
    Users updateUsers(Users users);


    /**
     * 查询全部数据
     * @return
     */
    List<Users> findAllUsers();
}
