package ch08.Map;

import java.util.IdentityHashMap;

public class IdentityHashMapTest {
    public static void main(String[] args){
        IdentityHashMap ihm = new IdentityHashMap();
        ihm.put(new String("语文"),11);
        ihm.put(new String("语文"),22);
        ihm.put("java",44);
        ihm.put("java",33);
        System.out.println(ihm);
    }
}
