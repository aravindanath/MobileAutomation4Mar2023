package day4;

public class ExceptionExample2 {

    public static void main(String[] args) {

        System.out.println("Starting");

        try {
            String name = null;
            System.out.println("Name: " + name.length());
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (NullPointerException n){
            n.printStackTrace();
        }

        System.out.println("Ending");


    }
}
