package resource_test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourceTest {
    public static void main(String[] args) throws IOException {
        System.out.println("with loader");
        InputStream resourceAsStream = ResourceTest.class.
                getClassLoader().
                getResourceAsStream("test/user.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));


        //load without loader
        System.out.println("without loader otnosit");
        resourceAsStream = ResourceTest.class.
//                getClassLoader().
                getResourceAsStream("/test/user.properties");
        properties = new Properties();
        properties.load(resourceAsStream);
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));


        System.out.println("without loader abs");
        resourceAsStream = ResourceTest.class.
//                getClassLoader().
        getResourceAsStream("user.properties");
        properties = new Properties();
        properties.load(resourceAsStream);
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
    }
}
