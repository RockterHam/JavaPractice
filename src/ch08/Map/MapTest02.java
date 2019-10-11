package ch08.Map;

import java.util.HashMap;

public class MapTest02 {
    public static void main(String[] args){
        HashMap hm = new HashMap();
        hm.put("Java",21);
        hm.put("Docker",34);
        hm.put("Nginx",13);
        hm.replace("NoMatch",62);
        System.out.println(hm);
        hm.merge("Java",4, (oldVal , param) -> (Integer)oldVal + (Integer)param);       //"Java"的value+10
        System.out.println(hm);
        hm.computeIfAbsent("Docker", v -> ((String)v).length());       //??
        System.out.println(hm);
        //hm.computeIfAbsent("Java", (key , value) -> ((Integer)value * (Integer) value));       //??
        System.out.println(hm);
    }
}
