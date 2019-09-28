package ch08.Collection_Iterator_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrTest {
    public static void main(String[] args){
        HashSet books = new HashSet();
        books.add("Java");
        books.add("Swift");
        books.add("Kotlin");
        Iterator it = books.iterator();
        while (it.hasNext()){
            String book = (String)it.next();
            System.out.println(book);
            if(book.equals("Swift")){
                books.remove(book);
            }
        }
        System.out.println(books);
    }
    //在执行完迭代器后，remove最后一个元素不会触发ConcurrentModificationException（fail—fast），例如remove "Kotlin"
}
