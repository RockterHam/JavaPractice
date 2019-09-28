package ch08.Set_Collection;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args){
        TreeSet nums = new TreeSet();
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(-9);
        System.out.println(nums);
        System.out.println(nums.first());
        System.out.println(nums.last());
        System.out.println(nums.headSet(4));//返回小于4的子集
        System.out.println(nums.tailSet(5));//返回大于等于5的子集
        System.out.println(nums.subSet(-3,4));//大于等于-3，小于4的子集
    }
}