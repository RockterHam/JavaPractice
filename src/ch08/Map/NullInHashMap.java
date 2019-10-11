package ch08.Map;

import java.util.HashMap;

public class NullInHashMap {
    public static void main(String[] args){
        HashMap hs = new HashMap();
        hs.put(null, null);
        hs.put(null, null);
        hs.put("a" , null);
        System.out.println(hs);
    }
}
