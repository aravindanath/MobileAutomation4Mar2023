package day4;

public class ExceptionExample3 {

    public static void main(String[] args) {

        System.out.println("Starting");

        try {
            String name = null;
            System.out.println("Name: " + name.length());
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Ending");


    }
}
