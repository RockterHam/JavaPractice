package ch08.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    public static void main(String[] args){
        LinkedHashMap scores = new LinkedHashMap();
        scores.put("语文",80);
        scores.put("数学",60);
        scores.put("英语",90);
        scores.forEach((key,value)->System.out.println(key+"-->"+value));
    }
}
