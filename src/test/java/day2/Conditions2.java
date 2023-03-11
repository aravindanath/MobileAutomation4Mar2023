package day2;

public class Conditions2 {

    public static void main(String[] args) {

      int marks = 89;

      if(marks < 35){
          System.out.println("FAIL");
      }else if(marks >=35 && marks <45){
          System.out.println("PASS CLass");
      }else if(marks >=45 && marks <55){
          System.out.println("Second CLass");
      }else if (marks >=55 && marks <85) {
          System.out.println("First CLass");
      }else if (marks >=85 && marks <=100) {
          System.out.println("Top CLass");
      }else {
          System.out.println("Contact Admin");
      }

    }
}
