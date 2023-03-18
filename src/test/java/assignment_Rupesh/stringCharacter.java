package assignment_Rupesh;

public class stringCharacter {
    public static void main(String[] args) {
        String name = "Rupesh";
        System.out.println(name.length());
        for (int i = 0; i <= name.length()-1; i++) {
            System.out.println("Character at position " + i + " is " + name.charAt(i));
        }
    }
}
