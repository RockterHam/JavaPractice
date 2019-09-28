package ch08.Collection_Iterator_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorEach {
    public static void main(String[] args){
        HashSet books = new HashSet();
        books.add("Java");
        books.add("Kotlin");
        books.add("Swift");
        Iterator it = books.iterator();
        it.forEachRemaining(obj->System.out.println("迭代器的元素:"+obj));
    }
}
