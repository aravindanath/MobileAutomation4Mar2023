package day3;

public class AccessModifier {


    public  void publicMethod(){
        System.out.println("Public method");
    }

    protected   void protectedMethod(){
        System.out.println("protected method");
    }

        void defaultMethod(){
        System.out.println("Default method");
    }

    private void privateMethod(){
        System.out.println("Private method");
    }

    public static void main(String[] args) {

        AccessModifier am = new AccessModifier();
        am.defaultMethod();
        am.publicMethod();
        am.privateMethod();
        am.protectedMethod();
    }
}
