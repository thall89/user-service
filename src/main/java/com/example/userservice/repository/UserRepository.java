package com.example.userservice.repository;

import com.example.userservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User findById(String id){
        User exampleUser = new User();
        exampleUser.setId("123");
        exampleUser.setUserType("basic");
        exampleUser.setName("teo");
        return exampleUser;
    }

    public User createUSer(User user){
        User exampleUser = new User();
        exampleUser.setId(user.getId());
        exampleUser.setUserType(user.getUserType());
        exampleUser.setName(user.getName());
        return exampleUser;
    }
}
