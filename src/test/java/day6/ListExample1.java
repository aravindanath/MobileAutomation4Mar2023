package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample1 {

    public static void main(String[] args) {



        List<String> names = new ArrayList<String>();

        names.add("Kartik");
        names.add("Nikita");
        names.add("Ravi");
        names.add("Aadvik");

        System.out.println(names);
        Collections.sort(names,Collections.reverseOrder());

        System.out.println(names);

    }
}
