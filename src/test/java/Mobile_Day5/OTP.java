package Mobile_Day5;

public class OTP {

    public static void main(String[] args) {

        String msg = "Hi Arvind, OTP 2323 for txr id13423 on 03/06/23.";

        for(String str : msg.split(" ")){
            if(str.matches("\\d{5}")){
                System.out.println("OTP: "+str);
            }else if(str.matches("\\d{4}")){
                System.out.println("OTP: "+str);
            }
        }


    }
}
