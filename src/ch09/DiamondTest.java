package ch09;

import java.util.ArrayList;
import java.util.List;

public class DiamondTest {
    public static void main(String[] args){
        List<String> books = new ArrayList<>();
        books.add("Java");
        books.add("Servlet");
        books.forEach(str -> System.out.println(str));
    }
}
