package com.select.seat.service.impl;

import com.select.seat.entity.Users;
import com.select.seat.repository.UsersRepository;
import com.select.seat.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users addUsers(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public void delUsers(int id) {
        usersRepository.deleteById((long) id);
    }

    @Override
    public Users updateUsers(Users users){
        return usersRepository.save(users);
    }

    @Override
    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }

}
