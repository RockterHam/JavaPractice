package ch08.List_Collection;

import java.util.ArrayList;

class A {
    @Override
    public boolean equals(Object obj){
        return true;
    }
}

public class ListTest02 {
    public static void main(String[] args){
        ArrayList books = new ArrayList();
        books.add("Java");
        books.add("kotlin");
        books.add("Docker");
        System.out.println(books);
        books.remove(new A());
        System.out.println(books);
        books.remove(new A());
        System.out.println(books);//remove时调用equals比较，如果equals方法返回为真，删除该元素
    }
}
