package com.dao;

import com.models.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
@Repository("userDAO")
public class UserDAO {
    private List users = Arrays.asList(
            new User("name1", "surname1", 12),
            new User("name2", "surname2", 15)
    );


    public List getAllUsers() {
        return users;
    }

}
