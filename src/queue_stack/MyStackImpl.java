package queue_stack;

import java.util.ArrayList;

public class MyStackImpl<T> implements MyStack<T> {
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void push(T item) {
        list.add(0, item);
    }

    @Override
    public T pop() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
