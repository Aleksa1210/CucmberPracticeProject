package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // 1 Create properties object
    // 2 Make this private to be inaccessible outside
    // 3 We make it static because static run first and  will use the object under static method
    private static Properties properties = new Properties(); // use getter encapsulation

    // we have static block because static run first
    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
        } catch (IOException e) {
            System.out.println("Fail not found in configuration reader class");
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword){ // call for class name
        return  properties.getProperty(keyword);
    }
}
