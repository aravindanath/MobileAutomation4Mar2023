package day3;

public class Dog extends Animal {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.fur();
        dog.tail();
        dog.bark();
    }


    public void bark(){
        System.out.println("Bark");
    }

}
