package ch08.Map;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args){
        HashMap hm = new HashMap();
        hm.put("Java",2);
        hm.put("Docker",3);
        hm.put("Nginx",1);
        hm.put("Spring",5);
        System.out.println(hm.put("Java",8));
        System.out.println(hm);
        System.out.println("Key'Java':"+hm.containsKey("Docker"));
        System.out.println("Value'2':"+hm.containsValue("2"));
        for(var key:hm.keySet()){
            System.out.println(key + "-->" + hm.get(key));
        }
    }
}
