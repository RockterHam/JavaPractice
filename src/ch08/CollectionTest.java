package ch08;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList c = new ArrayList();
        c.add("孙悟空");
        c.add(6);
        System.out.println("c集合的大小:" + c.size());
        c.remove(0);
        System.out.println("c集合的大小:" + c.size());
        System.out.println("是否包含孙悟空:" + c.contains("孙悟空"));
        c.add("JavaEE应用实战");
        System.out.println("c的元素:" + c);
        HashSet books = new HashSet();
        books.add("JavaEE应用实战");
        books.add("疯狂Java讲义");
        System.out.println("c集合是否完全包含books集合:" + c.containsAll(books));
        c.removeAll(books);//c减books的元素
        System.out.println("c集合里的元素:" + c);
        c.clear();
        System.out.println("c集合里的元素:" + c);
        books.retainAll(c);
        System.out.println("books集合里的元素:" + books);

    }
}
