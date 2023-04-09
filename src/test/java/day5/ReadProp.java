package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

    public static void main(String[] args) throws IOException {
//
//        String path = System.getProperty("user.dir")+ File.separator+"config.properties";
//
//        FileInputStream fis = new FileInputStream(path);
//        Properties props = new Properties();
//        props.load(fis);
//       String value =  props.getProperty("url");
//       System.out.println(value);

//       String val =  Generic.getValue("deviceName");
//       System.out.println(val);
//
//        String udid =  Generic.getValue("udid");
//        System.out.println(udid);


        Generic.setValue("country","USA");

    }
}
