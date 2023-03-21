package assignment_Rupesh;

public class SmallestNumber {
    public static void main(String[] args) {
        int a = 13;
        int b = 5;
        int c = 10;
        if (a <= b && a <= c)
            System.out.println(a + " is the smallest");
        else if (b <= a && b <= c) {
            System.out.println(b + " is the smallest");
        } else {

            System.out.println(c + " is the smallest");

        }
    }



}
