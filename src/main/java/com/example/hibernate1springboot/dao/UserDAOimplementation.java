package com.example.hibernate1springboot.dao;

import com.example.hibernate1springboot.UsersEntity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDAOimplementation implements UserDAOInterface {


    private EntityManager entityManager;

    @Autowired
    public UserDAOimplementation(EntityManager entityManager) {
        System.out.println("88888888888888888888888888888888888888888888888888888888888888888888");
        System.out.println("Iam DAO class ");
        this.entityManager = entityManager;
        System.out.println(entityManager.getClass());
    }

    @Override
    @Transactional
    public void save(UsersEntity usersEntity) {
        entityManager.persist(usersEntity);
    }

    @Override
    public UsersEntity findByid(Integer id) {
        return entityManager.find(UsersEntity.class,id);
    }
}
