package assignment_Rupesh;

public class SumOfNumbersArrayString {
    public static void main(String[] args) {
        String test1 = "Rup24esh55";
        char[] test2 = test1.toCharArray();


        int sum = 0;

        for(int i=0;i<test2.length;i++)
        {
            if(Character.isDigit(test2[i]))
            {
                sum = sum + test2[i];

            }

        }
        System.out.println(sum);

    }
}
