package com.example.hibernate1springboot.dao;

import com.example.hibernate1springboot.UsersEntity;

public interface UserDAOInterface {

    void save(UsersEntity usersEntity);
    UsersEntity findByid(Integer id );
}
