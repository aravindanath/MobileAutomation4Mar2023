package day5;

import com.github.javafaker.Faker;

import java.util.Locale;

public class JavaFakerLib {


    public static void main(String[] args) {

//
//        Faker faker = new Faker(new Locale("en-US"));
//        String fn =  faker.name().firstName();
//        System.out.println(fn+"@testmail.com");
//
//       String mob =  faker.number().digits(10);
//       System.out.println(mob);
//
//      String address  = faker.address().fullAddress();
//      System.out.println(address);

    System.out.println("Email: " + Generic.email());

    }
}
