package com.zacharyahutton.ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Singly linked list demonstrating O(1) prepend and O(n) search.
 */
public class LinkedList implements Iterable<Integer> {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private int size;

    public void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    public boolean contains(int value) {
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.value == value) return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public List<Integer> toList() {
        List<Integer> out = new ArrayList<>();
        for (Node cur = head; cur != null; cur = cur.next) {
            out.add(cur.value);
        }
        return out;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Integer next() {
                if (current == null) throw new NoSuchElementException();
                int v = current.value;
                current = current.next;
                return v;
            }
        };
    }
}
