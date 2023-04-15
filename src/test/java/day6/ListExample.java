package day6;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {



        List<String> names = new ArrayList<String>();

        names.add("Kartik");
        names.add("Nikita");
        names.add("Ravi");
        names.add("Aadvik");
        names.add("Aadvik");


        System.out.println(names.size());

        System.out.println(names.get(0));

        for(String nm : names) {
            System.out.println(nm);
        }

    }
}
