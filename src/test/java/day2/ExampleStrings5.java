package day2;

public class ExampleStrings5 {

    public static void main(String[] args) {
//                     0,1,2,3
        String name = "Hello World";
        System.out.println(name.equals("Hello WORLD"));
        System.out.println(name.equalsIgnoreCase("Hello WORLD"));
        System.out.println(name.contains("He"));
        System.out.println(name.startsWith("He"));
        System.out.println(name.endsWith("ld"));
    }
}
