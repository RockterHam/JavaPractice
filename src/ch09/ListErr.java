package ch09;

import java.util.ArrayList;

public class ListErr {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("Java");
        al.add("Docker");
        al.add(5);
//        for (Object temp : al){
//            System.out.println(temp);
//        }
        al.forEach(str ->System.out.println((String)str));
    }
}
