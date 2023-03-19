package day4;


import java.io.File;
import java.io.IOException;

public class ExceptionExample6 {

    public static void main(String[] args)  {

        System.out.println("Starting");

        String path = System.getProperty("user.dir")+ File.separator+"demo.txt";

        try {
            File file = new File(path);
            if (file.exists()) {
                System.out.println("File exists");
            } else {
                file.createNewFile();
                System.out.println("New file created");
            }
        }catch(Exception e) {

        }


        System.out.println("Ending");


    }
}
