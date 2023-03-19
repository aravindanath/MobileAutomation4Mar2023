package day4;


import java.io.File;

public class ExceptionExample7 {

    public static void main(String[] args) throws Exception {

        System.out.println("Starting");

        int amt = 99;
        if(amt >= 100){
            System.out.println("Please collect your cash");
        }else if(amt < 100){
            throw new Exception("Please Enter 100 multiples");
        }


        System.out.println("Ending");


    }
}
