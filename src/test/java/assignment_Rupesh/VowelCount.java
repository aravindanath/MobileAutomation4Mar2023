package assignment_Rupesh;

public class VowelCount {
    public static void main(String[] args) {
        int count = 0;
        String test1="howue";
        for (int i=0 ; i<test1.length(); i++){
            char ch=test1.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
            {
                count ++;
            }

        }
        System.out.println(count);
    }
}
