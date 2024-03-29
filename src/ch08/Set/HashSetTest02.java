package ch08.Set;

import java.util.HashSet;
import java.util.Iterator;

class R{
    int count;
    public R(int count){
        this.count = count;
    }

    @Override
    public String toString(){
        return "R[count:" + count + "]";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj != null && obj.getClass() == R.class){
            R r = (R) obj;
            return this.count == r.count;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.count;
    }
}

public class HashSetTest02 {
    public static void main(String[] args){
        HashSet hs = new HashSet();
        hs.add(new R(5));
        hs.add(new R(-3));
        hs.add(new R(9));
        hs.add(new R(-2));
        System.out.println(hs);
        Iterator it = hs.iterator();
        R first = (R) it.next();
        first.count = -3;
        System.out.println(hs);
        hs.remove(new R(-3));
        System.out.println(hs);
        System.out.println("是否包含count = -3:"+hs.contains(new R(-3)));
        System.out.println("是否包含count = -2:"+hs.contains(new R(-2)));
        //hashset已经混乱，谨慎修改集合元素的值，因为hashcode（）与euqals（）参与计算
    }
}
