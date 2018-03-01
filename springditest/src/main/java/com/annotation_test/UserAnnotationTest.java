package com.annotation_test;

import com.models.User;

import java.lang.reflect.Field;

public class UserAnnotationTest {
    public static void main(String[] args) throws NoSuchFieldException {
        Object user = new User("name", "surname", 20);
        Class metaData = user.getClass();
        Field name = metaData.getDeclaredField("name");
        NickNameAnnotation annotation = name.getDeclaredAnnotation(NickNameAnnotation.class);
        if (annotation != null) {
            System.out.println("annotation is avaliable");
            System.out.println(annotation.value());
        }
    }
}
