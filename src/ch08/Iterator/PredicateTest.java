package ch08.Iterator;

import java.util.HashSet;

public class PredicateTest {
    public static void main(String[] args) {
        HashSet books = new HashSet();
        books.add("Java");
        books.add("Kotlin");
        books.add("Swift");
        books.add("Ajax");
        books.removeIf(ele->((String)ele).length()<5);
        System.out.println(books);
    }
}