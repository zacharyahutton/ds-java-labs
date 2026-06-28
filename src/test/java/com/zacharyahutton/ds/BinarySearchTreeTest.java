package com.zacharyahutton.ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    @Test
    void insertAndSearch() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        assertTrue(bst.contains(5));
        assertFalse(bst.contains(99));
        assertEquals(3, bst.size());
        assertEquals(java.util.List.of(5, 10, 15), bst.inOrder());
    }
}
