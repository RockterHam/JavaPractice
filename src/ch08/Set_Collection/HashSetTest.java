package ch08.Set_Collection;

import java.util.HashSet;

class A{
    @Override
    public boolean equals(Object obj){
        return true;
    }
    @Override
    public String toString(){
        return "A:hashcode@"+hashCode();
    }
}

class B{
    @Override
    public int hashCode(){
        return 1;
    }
    @Override
    public String toString(){
        return "B:hashcode@"+hashCode();
    }
}

class C{
    @Override
    public int hashCode(){
        return 2;
    }
    @Override
    public boolean equals(Object obj){
        return true;
    }
    @Override
    public String toString(){
        return "C:hashcode@"+hashCode();
    }
}

public class HashSetTest {
    public static void main(String[] args) {
        HashSet books = new HashSet();
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }
}
