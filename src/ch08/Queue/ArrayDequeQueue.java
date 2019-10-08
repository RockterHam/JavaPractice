package ch08.Queue;

import java.util.ArrayDeque;

public class ArrayDequeQueue {
    public static void main(String[] args){
        ArrayDeque ad = new ArrayDeque();
        ad.offer("Java");
        ad.offer("Ajax");
        ad.offer("Dubbo");
        ad.offer("Docker");
        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad);
        System.out.println(ad.poll());
        System.out.println(ad);
    }
}
