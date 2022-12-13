package queue_stack;

public interface MyQueue<T>{
    void add(T item);
    T remove();
    boolean isEmpty();
}
