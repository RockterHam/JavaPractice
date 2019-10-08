package ch08.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest{
    public static void main(String[] args){
        LinkedHashSet books = new LinkedHashSet();
        books.add("Java");
        books.add("Kotlin");
        System.out.println(books);
        books.remove("Java");
        books.add("Java");
        System.out.println(books);

    }
}
