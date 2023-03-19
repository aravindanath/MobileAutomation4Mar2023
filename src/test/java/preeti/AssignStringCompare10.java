package preeti;

public class AssignStringCompare10 {
    public static void main(String[] args) {
        String place1 = "Madam";

      char[] v1 =   place1.toCharArray();

      for(Character v : v1) {
          if(v.toString().equalsIgnoreCase("a")||v.toString().equalsIgnoreCase("m")){
              System.out.println("Duplicate: " +v);
          }
          else {
              System.out.println("Not Duplicate: " +v);
          }
      }

    }

    /**
     *   String str = "Madam";
     *
     *   convert array
     *
     *
     */
}
