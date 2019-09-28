package ch08.Set_Collection;

import java.util.TreeSet;

class Err implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class TreeSetErrTest {
    public static void main(String[] args){
        TreeSet ts = new TreeSet();
        ts.add(new Err());
    }
}
