package day3;

public class Books {

    public Books() {
        System.out.println("Default constructor");
    }

    public Books(String author,String title){
        System.out.println("Author: " + author);
        System.out.println("Title: "    + title);
    }

    public void books(){
        System.out.println("Books methods");
    }

    public static void main(String[] args) {
        new Books("Arvind","Automation");
       Books ref =  new Books();
       ref.books();
    }
}
