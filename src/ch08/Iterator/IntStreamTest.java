package ch08.Iterator;

import java.util.stream.IntStream;

public class IntStreamTest {
    public static void main(String[] args){
        IntStream is = IntStream.builder()
                .add(20)
                .add(13)
                .add(-2)
                .add(18)
                .build();
//        System.out.println("max"+is.max().getAsInt());
//        System.out.println("min"+is.min().getAsInt());
//        System.out.println("sum"+is.sum());
//        System.out.println("count"+is.count());
//        System.out.println("ave"+is.average());
//        System.out.println("is所有元素的平方是否都大于20"+is.allMatch(ele -> ele * ele > 20));
//        System.out.println("is是否包含任何元素的平方大于20"+is.anyMatch(ele -> ele * ele > 20));

        IntStream newIs = is.map(ele -> ele * 2 + 1);//映射为一个新的Stream
        newIs.forEach(System.out::println);

    }
}
