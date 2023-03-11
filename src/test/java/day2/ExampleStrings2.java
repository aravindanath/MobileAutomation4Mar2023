package day2;

public class ExampleStrings2 {

    public static void main(String[] args) {

        String name = "Preeti_245325";
   //            [Preeti,245325]
        String fn = name.split("_")[0];
        String mob = name.split("_")[1];

        System.out.println("FN: "+fn+" mob: "+mob);
    }
}
