package day6;

import java.util.HashMap;
import java.util.Map;

public class MapExaple {
    public static void main(String[] args) {

//              key, value
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name","Arvind");
        map.put("job","Automation Eng");
        map.put("city","Bangalore");

        System.out.println(map.get("job"));
    }
}
