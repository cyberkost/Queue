package queue_stack;

import queue_stack.MyQueueImpl;

public class QueueAndStackTest {
    public static void main(String[] args) {
        System.out.println("FIFO---------------------------------");
        testQueue();
        System.out.println("LIFO---------------------------------");
        testStack();
    }

    private static void testQueue() {
        MyQueueImpl<Integer> queue = new MyQueueImpl<>();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            queue.add(i);
        }
        System.out.println("-----------------------------------");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    private static void testStack() {
        MyStackImpl<Integer> stack = new MyStackImpl<>();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            stack.push(i);
        }
        System.out.println("------------------------------------");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

