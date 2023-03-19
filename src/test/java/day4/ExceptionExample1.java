package day4;

public class ExceptionExample1 {

    public static void main(String[] args) {

        System.out.println("Starting");


        try {
            int i = 10;
            int x = 2;
            int div = i / x;
            System.out.println("Div: " + div);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Ending");


    }
}
