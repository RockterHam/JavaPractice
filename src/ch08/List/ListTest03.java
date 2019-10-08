package ch08.List;

import java.util.ArrayList;

public class ListTest03 {
    public static void main(String[] args){
        ArrayList books = new ArrayList();
        books.add("Java");
        books.add("Kotlin");
        books.add("Ajax");
        books.add("Docker");
        books.sort(((o1, o2) -> ((String)o1).length()-((String)o2).length()));
        System.out.println(books);
        books.replaceAll(ele -> ((String)ele).length());
        System.out.println(books);
    }
}
