package ch08.Collection_Iterator_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args){
        HashSet books = new HashSet();
        books.add("Java");
        books.add("Kotlin");
        books.add("Swift");
        Iterator it = books.iterator();
        while (it.hasNext()){
            String book = (String)it.next();
            System.out.println(book);
            if(book.equals("Kotlin")){
                it.remove();
            }
            book = "Test String";
        }
        System.out.println(books);
    }
}
