package com.example.hibernate1springboot;

import com.example.hibernate1springboot.dao.UserDAOInterface;
import com.example.hibernate1springboot.dao.UserDAOimplementation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Hibernate1SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hibernate1SpringbootApplication.class, args);

    }
    @Bean
    public CommandLineRunner commandLineRunner (UserDAOInterface userDAOInterface){
        return runner->{
            //createUser(userDAOInterface);
             readUSer(userDAOInterface);

        };
    }

    private void createUser(UserDAOInterface userDAOInterface){
        System.out.println("Creating User objects ");
        UsersEntity usersEntity = new UsersEntity("Sueddadeaweafsdasdadaaawqm3","subrdasdadaweaeae@gmail.com3","password34");
        userDAOInterface.save(usersEntity);
        System.out.println("Saved student . Generate id : "+usersEntity.getId());
    }
    private void readUSer(UserDAOInterface userDAOInterface){
        System.out.println("Creating User objects ");
        UsersEntity usersEntity = new UsersEntity("Dosssndakl","sasmaisssl.com3","password34");


        System.out.println("saving the user object");
        userDAOInterface.save(usersEntity);

        int theid = usersEntity.getId();

        System.out.println("saved the user : generated id :"+ theid);
        UsersEntity usersEntity1 = userDAOInterface.findByid(theid);
        System.out.println(usersEntity1);


    }

}
