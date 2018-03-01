package com.test;

import com.dao.UserDAO;
import com.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserSystemAnnotationTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService.hashCode());
        System.out.println(userService.getAllUsers());
//        UserDAO userRepo = context.getBean("userDAO2", UserDAO.class);
//        System.out.println(userRepo.getAllUsers());
    }
}
