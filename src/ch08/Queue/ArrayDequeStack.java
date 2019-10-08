package ch08.Queue;

import java.util.ArrayDeque;

public class ArrayDequeStack {
    public static void main(String[] args){
        ArrayDeque stack = new ArrayDeque();
        stack.push("Java");
        stack.push("Ajax");
        stack.push("Dubbo");
        stack.push("Docker");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
