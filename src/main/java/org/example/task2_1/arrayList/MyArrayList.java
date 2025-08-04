package org.example.task2_1.arrayList;

import java.util.Collection;

public class MyArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size = 0;
    private int capacity;

    public MyArrayList() {
        capacity = DEFAULT_CAPACITY;
        elements = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    private void checkIfIOB(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index cannot be negative or greater than array size");
        }
    }

    private void checkCapacity(int i) {
        if (i < capacity - 1)
            increaseCapacity();
    }

    private void increaseCapacity() {
        int capacity = (int) (elements.length * 1.5 - 1);
        Object[] temp = new Object[capacity];
        for (int i = 0; i < elements.length; i++)
            temp[i] = elements[i];
        elements = temp;
    }


    public void add(E e) {
        checkCapacity(size + 1);
        elements[size++] = e;
    }

    public void addAll(Collection<? extends E> c) {
        c.forEach(this::add);

    }

    public void remove(int index) {
        checkIfIOB(index);
        size--;
        Object[] temp = new Object[elements.length];
        for (int i = 0, j = 0; i < elements.length; i++) {
            if (index != i)
                temp[j++] = elements[i];
        }
        elements = temp;


    }

    public E get(int index) {
        checkIfIOB(index);
        return (E) elements[index];
    }
}
