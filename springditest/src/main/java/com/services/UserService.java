package com.services;

import com.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

//    @Resource
//    @Qualifier("bad_qualifier")
    @Autowired
   // @Qualifier("bad_qualifier")
    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserService() {
    }

    public List getAllUsers() {
        return userDAO.getAllUsers();
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
