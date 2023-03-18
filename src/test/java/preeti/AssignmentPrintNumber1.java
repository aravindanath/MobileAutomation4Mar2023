package preeti;

public class AssignmentPrintNumber1 {
    public static void main(String[] args) {
        int num = 100;
        for(int i=1;i<=num; i++)
        {
            System.out.println(i);

            if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0)
            {System.out.println("FizzBuzz");
            }
            }
        }

    }

