package ch08.List;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args){
        LinkedList books = new LinkedList();
        books.offer("Java");        //将元素加到队列尾部
        books.push("Dubbo");        //压栈
        books.offerFirst("Ajax");       //加入队列的头部（相当于栈顶）
        for(var temp:books){
            System.out.println(temp);       //遍历
        }
        System.out.println("---------");
        System.out.println(books.peekFirst());      //访问不删除栈顶
        System.out.println(books.peekLast());       //访问不删除队列的最后一个元素
        System.out.println(books.pop());        //出栈
        System.out.println(books);
        System.out.println(books.pollLast());       //访问并删除最后一个
        System.out.println(books);
    }
}
