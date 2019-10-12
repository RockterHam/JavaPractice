package ch08.Map;

import java.util.TreeMap;

class T implements Comparable{
    int count;

    public T(int count){
        this.count = count;
    }

    public String toString(){
        return "T[count = " + count + "]";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == T.class){
            T t = (T) obj;
            return t.count == this.count;
        }
        return false;
    }

    @Override
    public int compareTo(Object obj) {
        T t = (T) obj;
        return count > t.count ? 1 : count< t.count ? -1 : 0;
    }
}

public class TreeMapTest {
    public static void main(String[] args){
        TreeMap tm = new TreeMap();
        tm.put(new T(3) , "Java");
        tm.put(new T(-5) , "Dubbo");
        tm.put(new T(9) , "Docker");
        System.out.println(tm);
        System.out.println(tm.firstEntry());        //返回第一个Entry对象
        System.out.println(tm.lastKey());       //返回最后一个key值
        System.out.println(tm.higherKey(new T(2)));        //返回比T（2）大的最小key值
        System.out.println(tm.lowerEntry(new T(2)));        //返回比T（2）小的最大key-value
        System.out.println(tm.subMap(new T(-1),new T(4)));      //返回限定的子treemap
    }
}
