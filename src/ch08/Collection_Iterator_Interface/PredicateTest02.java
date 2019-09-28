package ch08.Collection_Iterator_Interface;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest02 {
    public static int calAll(Collection books, Predicate p){
        int total = 0;
        for(Object obj:books){
            if(p.test(obj)){
                total++;
            }
        }
        return total;
    }
    public static void main(String[] args){
        HashSet books = new HashSet();
        books.add("Java");
        books.add("Kotlin");
        books.add("Swift");
        books.add("Ajax");
        System.out.println(calAll(books,ele->((String)ele).contains("i")));
        System.out.println(calAll(books,ele->((String)ele).contains("Java")));
        System.out.println(calAll(books,ele->((String)ele).length()>4));
    }
}
