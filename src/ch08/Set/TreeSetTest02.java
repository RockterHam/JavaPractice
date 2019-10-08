package ch08.Set;

import java.util.TreeSet;

class Z implements Comparable{
    int age = 0;
    public Z(int age){
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        return true;
    }

    @Override
    public int compareTo(Object obj) {          //0为相等，1为不相等
        return 1;
    }
}

public class TreeSetTest02 {
    public static void main(String[] args){
        TreeSet set = new TreeSet();
        Z z1 = new Z(6);
        set.add(z1);
        System.out.println(set.add(z1));
        System.out.println(set);
        ((Z)(set.first())).age = 9;             //两个变量被认为是不相同的，但是指向了同一个age变量，所以修改其中一个时，都会被修改。
        System.out.println(((Z)(set.last())).age);
    }
}
