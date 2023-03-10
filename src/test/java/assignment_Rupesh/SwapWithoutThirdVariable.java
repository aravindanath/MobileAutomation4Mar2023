package assignment_Rupesh;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 90;
        a = a+b; //store addition

        b=a-b; //store subtraction

        a=a-b;
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);
    }
}
