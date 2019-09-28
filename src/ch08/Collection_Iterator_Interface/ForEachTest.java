package ch08.Collection_Iterator_Interface;

import java.util.HashSet;

public class ForEachTest {
    public static void main(String[] args){
        HashSet books = new HashSet();
        books.add("Java");
        books.add("Kotlin");
        books.add("Swift");
        for(Object obj:books){
            //String book = (String)obj;
            System.out.println(obj);
        }
    }
}
//不可修改集合元素，否则fail—fast