package com.zacharyahutton.ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    void addFirstAndIterate() {
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(1);
        assertEquals(2, list.size());
        assertTrue(list.contains(1));
        assertEquals(java.util.List.of(1, 2), list.toList());
    }
}
