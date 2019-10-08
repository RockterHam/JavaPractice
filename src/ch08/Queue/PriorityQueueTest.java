package ch08.Queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args){
        PriorityQueue pq = new PriorityQueue();
        pq.offer(2);
        pq.offer(1);
        pq.offer(-4);
        pq.offer(6);
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
