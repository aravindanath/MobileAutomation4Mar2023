package day5;

import com.github.javafaker.Faker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.Properties;

public class Generic {


    public static String getValue(String key){
        String path = System.getProperty("user.dir")+ File.separator+"config.properties";
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties props = new Properties();
            props.load(fis);
            value = props.getProperty(key);
        }catch (Exception e){
            e.printStackTrace();
        }
        return value;
    }


    public static void setValue(String key, String value){
        String path = System.getProperty("user.dir")+ File.separator+"config.properties";
        try {
            FileOutputStream fis = new FileOutputStream(path,true);
            Properties props = new Properties();
            props.setProperty(key, value);
            props.store(fis,"Test data");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static String email(){
        Faker faker = new Faker(new Locale("en-US"));
        String fn =  faker.name().firstName();
         String email = fn+"@testmail.com";
        return email;
    }
}
