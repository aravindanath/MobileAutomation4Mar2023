package day2;

public class Calculator {

//Access modifier : return Type : MethodName : (Parameter) {Body}
    public void addNumber(int x, int y) {
        int sum = x+y;
        System.out.println("Sum: " +sum);
    }



    public static void main(String[] args) {
     // ClassName ref = new ClassName();
      Calculator cal =  new Calculator(); // Class Object
        cal.addNumber(101,233);
        cal.addNumber(3242,23452);

        multiplication(234,21);
      float x =   multiplication(22.2f,22.4f);
      System.out.println("x: " + x/3);
      method();
    }

    // Method overloading

    public static void multiplication(int x, int y){
        int mul = x*y;
        System.out.println("Mult: "+mul);
    }

    public static float  multiplication(float x, float y){
        float mul = x * y;
        return mul;
    }

    public static void method(){
        System.out.println("Dummy method overloading");
    }
}
