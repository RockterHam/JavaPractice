package ch08.Set_Collection;

import java.util.Date;
import java.util.TreeSet;

public class TreeSetErrTest02 {
    public static void main(String[] args){
        TreeSet ts = new TreeSet();
        ts.add(new String("Java"));
        ts.add(new Date());
    }
}
//TreeSet要添加相同的类的对象，否则无法正确实现compareTo