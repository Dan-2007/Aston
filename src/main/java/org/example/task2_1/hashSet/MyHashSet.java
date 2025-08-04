package org.example.task2_1.hashSet;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyHashSet<E> implements Iterable {
    private final int DEFAULT_CAPACITY = 16;
    private final float DEFAULT_LOAD_FACTOR = 0.75f;
    private Node<E>[] buckets;
    private int size;
    private final float loadFactor;

    public MyHashSet() {
        buckets = (Node<E>[]) new Node[DEFAULT_CAPACITY];
        loadFactor = DEFAULT_LOAD_FACTOR;
    }

    public boolean add(E e) throws NullPointerException {
        if (e == null)
            throw new NullPointerException("You cannot add null elements!");
        if (size >= buckets.length * loadFactor)
            increaseCapacity();

        int index = getIndex(e);
        Node<E> start = buckets[index];

        while (start != null) {
            if (start.value.equals(e))
                return false;
            start = start.next;
        }

        Node<E> node = new Node<>(e);
        node.next = buckets[index];
        buckets[index] = node;
        size++;
        return true;
    }

    public boolean remove(E e) {
        int index = getIndex(e);
        Node<E> curr = buckets[index];
        Node<E> prev = null;

        while (curr != null) {
            if (curr.value.equals(e)) {
                if (prev == null)
                    buckets[index] = curr.next;
                else
                    prev.next = curr.next;
                size--;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }

        return false;
    }

    private int getIndex(E e) {
        return (e.hashCode() & 0x7FFFFFFF ) % buckets.length;
    }

    private void increaseCapacity() {
        Node<E>[] oldBuckets = buckets;
        buckets = (Node<E>[]) new Node[oldBuckets.length * 2];
        size = 0;

        for (Node<E> start : oldBuckets) {
            while (start != null) {
                add(start.value);
                start = start.next;
            }
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator<E>() {
            private Node<E> currNode = null;
            private int currIndex = 0;
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                while (currNode == null && currIndex < buckets.length)
                    currNode = buckets[currIndex++];
                if (currNode == null)
                    throw new NoSuchElementException("There's no such element in Set");
                E value = currNode.value;
                currNode = currNode.next;
                counter++;
                return value;
            }
        };
    };

    private static class Node<E> {
        final E value;
        Node<E> next;

        Node(E value) {
            this.value = value;
        }
    }
}