package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample3 {

    public static void main(String[] args) {



        List<String> names = new ArrayList<String>();
        names.add("Aadvik");
        names.add("Kartik");
        names.add("Nikita");
        names.add("Ravi");
        names.add("Aadvik");

        System.out.println(names);

        names.remove(4);
        System.out.println(names);
    }
}
