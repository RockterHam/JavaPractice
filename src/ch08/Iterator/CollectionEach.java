package ch08.Iterator;

import java.util.HashSet;

public class CollectionEach {
    public static void main(String[] args){
        HashSet books = new HashSet();
        books.add("Java");
        books.add("Kotlin");
        books.add("Swift");
        books.forEach(obj->System.out.println("遍历："+obj));

//        for(Object obj :books) {
//            System.out.println(obj);
//        }
    }
}
