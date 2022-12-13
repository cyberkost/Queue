package queue_stack;

import queue_stack.MyQueue;

import java.util.ArrayList;

public class MyQueueImpl<T> implements MyQueue<T> {
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public T remove() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
