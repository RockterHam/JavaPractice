package ch08.Set_Collection;

import java.util.EnumSet;
import java.util.HashSet;

public class EnumSetTest02 {
    public static void main(String[] args){
        HashSet hs = new HashSet();
        hs.clear();
        hs.add(Season.FALL);
        hs.add(Season.SPRING);
        EnumSet es = EnumSet.copyOf(hs);
        System.out.println(es);
        hs.add("123");
        hs.add("456");
        es = EnumSet.copyOf(hs); //类型不全是枚举，报ClassCastException

    }
}
