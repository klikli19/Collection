package HW8.task2;

import java.util.ArrayDeque;
import java.util.Queue;


public class Shop {
    public static void main(String[] args) {

        Queue<String> queue1 = new ArrayDeque<>(5);
        Queue<String> queue2 = new ArrayDeque<>(5);

        for(int i = 0; i < Math.floor(Math.random() * 5); i++){
            queue1.offer("Alex" + i);
        }
        for(int i = 0; i < Math.floor(Math.random() * 5); i++){
            queue2.offer("Bob" + i);
        }


        System.out.println(queue1);
        System.out.println(queue2);
        addQueue("Tom", queue1, queue2);
        delQueue(queue1, queue2);


    }

    static void addQueue(String name, Queue<String> q1, Queue<String> q2) {
        if (q1.size() == q2.size() && q1.size() == 5) {
            System.out.println("Галю мне, пжл");
            return;
        }
        if (q1.size() < q2.size()){
            System.out.println(name);
        }
        if (q2.size() < q1.size()){
            System.out.println(name);
        }
    }

    static void delQueue(Queue<String> q1, Queue<String> q2) {
        if (Math.random() > 0.5) {
            q1.poll();
        } else {
            q2.poll();
        }
    }




}
