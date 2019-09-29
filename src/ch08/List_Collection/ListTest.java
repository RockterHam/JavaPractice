package ch08.List_Collection;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args){
        ArrayList books = new ArrayList();
        books.add("Java");
        books.add("Kotlin");
        books.add("Ajax");
        System.out.println(books);
        books.add(1,"Spring");
        for (Object temp : books){
            System.out.println(temp);
        }
        books.remove(2);
        System.out.println(books);
        System.out.println(books.indexOf(new String("Spring")));
        books.set(1,"Docker");
        System.out.println(books);
        System.out.println(books.subList(0,2));
    }
}
