package ch08.Map;

import java.util.EnumMap;

enum Season{
    SPRING,SUMMER,FALL,WINTER
}

public class EnumMapTest {
    public static void main(String[] args){
        EnumMap em = new EnumMap(Season.class);
        em.put(Season.SUMMER,"夏日炎炎");
        em.put(Season.SPRING,"春暖花开");
        System.out.println(em);
    }
}
