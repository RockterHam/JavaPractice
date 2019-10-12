package ch09;

import java.util.ArrayList;

public class GenericList {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Java");
        al.add("Docker");
        //al.add(5);
        al.forEach(str ->System.out.println((String)str));
    }
}
