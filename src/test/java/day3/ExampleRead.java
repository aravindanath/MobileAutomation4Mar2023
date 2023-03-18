package day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ExampleRead {

    public static void main(String[] args)  throws Exception {

        String path = System.getProperty("user.dir")+ File.separator+"studentslist";
        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);

//        for(int i=0; i<=5; i++) {
//            System.out.println(reader.readLine());
//        }

        String x = "";

        while ((x = reader.readLine())!=null){
            System.out.println(x);
        }

    }
}
