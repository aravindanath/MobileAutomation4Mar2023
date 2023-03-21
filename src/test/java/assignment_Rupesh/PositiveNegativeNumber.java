package assignment_Rupesh;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner temp= new Scanner(System.in);
        int num = temp.nextInt();
        if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Positive");
        }

    }
}
