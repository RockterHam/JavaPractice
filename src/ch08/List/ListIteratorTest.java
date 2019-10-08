package ch08.List;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args){
        String[] books = {"Java","Kotlin","Ajax","Docker"};
        ArrayList bookList = new ArrayList();
        for(int i = 0;i<books.length;i++){
            bookList.add(books[i]);
        }
        ListIterator ite = bookList.listIterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
            ite.add("-------------------------");
        }
        System.out.println("------反向迭代-------");
        while (ite.hasPrevious()){
            System.out.println(ite.previous());
        }
    }
}
