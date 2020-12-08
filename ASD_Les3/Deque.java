package ASD_Les3;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Deque <T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public Deque (int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }

    public T removeLeft() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeRight() {
        T temp = peek();
        size--;
        list[size] = null;
        return temp;
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[size] = item;
        size++;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

}
