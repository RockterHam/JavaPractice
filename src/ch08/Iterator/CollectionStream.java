package ch08.Iterator;

import java.util.HashSet;

public class CollectionStream {
    public static void main(String[] args){
        HashSet books = new HashSet();
        books.add("Java");
        books.add("Kotlin");
        books.add("Swift");
        books.add("Ajax");
        System.out.println(books.stream().filter(ele -> ((String)ele).contains("i")).count());
        System.out.println(books.stream().filter(ele -> ((String)ele).contains("Java")).count());
        System.out.println(books.stream().filter(ele -> ((String)ele).length()>4).count());
        books.stream().mapToInt(ele -> ((String)ele).length()).forEach(System.out::println);
    }
}
