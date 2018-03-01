package com.test;

import com.dao.UserDAO;
import com.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserSystemTest {
    public static void main(String[] args) {
//        UserService userService = new UserService();
//        List allUsers = userService.getAllUsers();
//        System.out.println(allUsers);
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-application.xml");
//        UserDAO userRepo = context.getBean("userRepo", UserDAO.class);
//        System.out.println(userRepo.getAllUsers());
//
//        UserService userService =(UserService) context.getBean("userService");
//       //System.out.println(userService.hashCode());
//        System.out.println(userService.getAllUsers());
        UserDAO userRepo = context.getBean("userRepo", UserDAO.class);
        System.out.println(userRepo.hashCode());

        userRepo = context.getBean("userRepo", UserDAO.class);
        System.out.println(userRepo.hashCode());

        UserService userService2 = context.getBean("userService2", UserService.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.printf("%s%n%s%n", userService, userService2);
        UserService userService3 = context.getBean("userService3", UserService.class);
    }
}
