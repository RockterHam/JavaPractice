package ch08.Set_Collection;

import java.util.Iterator;
import java.util.TreeSet;

class S implements Comparable{
    int count = 0;

    public S(int count){
        this.count = count;
    }

    @Override
    public String toString(){
        return "S[count:" + count + "]";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == S.class){
            S s = (S) obj;
            return s.count == this.count;
        }
        return false;
    }

    @Override
    public int compareTo(Object obj) {
        S s = (S) obj;
        return count > s.count ? 1 : count < s.count ? -1 : 0;
    }
}


public class TreeSetTest03 {
    public static void main(String[] args){
        TreeSet ts = new TreeSet();
        ts.add(new S(5));
        ts.add(new S(-3));
        ts.add(new S(9));
        ts.add(new S(-2));
        System.out.println(ts);
        S first = (S) ts.first();
        first.count = 20;
        S last = (S) ts.last();
        last.count = -2;
        System.out.println(ts);
        System.out.println(ts.remove(new S(-2)));
        System.out.println(ts);
        System.out.println(ts.remove(new S(5)));
        System.out.println(ts);
        System.out.println(ts.remove(new S(-2)));
        System.out.println(ts);
    }
}
