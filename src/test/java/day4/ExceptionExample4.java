package day4;

public class ExceptionExample4 {

    public static void main(String[] args) {

        System.out.println("Starting");
        try {
            String n1 = "30";
            int x = 20;

            Integer y = Integer.parseInt(n1);
            System.out.println(n1 + x);
            System.out.println(x + y);
        } catch (Exception e){

        }

        System.out.println("Ending");


    }
}
