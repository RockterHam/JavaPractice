package ch08.Set_Collection;

import java.util.TreeSet;

class M{
    int age = 0;

    public M(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "M[age:" + age + "]";
    }
}

public class TreeSetTest04 {
    public static void main(String[] args){
        TreeSet ts = new TreeSet((o1, o2) ->
        {
            M m1 = (M) o1;
            M m2 = (M) o2;
            return m1.age > m2.age ? -1 : m1.age < m2.age ? 1 : 0;  //通过与TreeSet关联的Lambda表达式来排序
        });
        ts.add(new M(5));
        ts.add(new M(-3));
        ts.add(new M(9));
        System.out.println(ts);

    }
}
