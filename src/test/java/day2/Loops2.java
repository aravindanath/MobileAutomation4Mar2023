package day2;

public class Loops2 {


    public static void main(String[] args) {


        String stuName[] = {"Arvind", "Rupesh", "Aadvik", "Preeti"};

        /**
         *
         *   for(DataType refVar : nameOfTheArrya){
         *          System.out.println(refVar);
         *   }
         *
         */

        for (String refVar : stuName) {
            if (refVar.equals("Aadvik")) {
                {
                    System.out.println(refVar + " Match Found");
                }
            } else {
                System.out.println("No Match Found");
            }
        }
    }
}
