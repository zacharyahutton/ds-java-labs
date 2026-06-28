package com.zacharyahutton.ds;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) return new Node(value);
        if (value < node.value) node.left = insert(node.left, value);
        else if (value > node.value) node.right = insert(node.right, value);
        return node;
    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(Node node, int value) {
        if (node == null) return false;
        if (value == node.value) return true;
        return value < node.value ? contains(node.left, value) : contains(node.right, value);
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) return 0;
        return 1 + size(node.left) + size(node.right);
    }

    public List<Integer> inOrder() {
        List<Integer> out = new ArrayList<>();
        inOrder(root, out);
        return out;
    }

    private void inOrder(Node node, List<Integer> out) {
        if (node == null) return;
        inOrder(node.left, out);
        out.add(node.value);
        inOrder(node.right, out);
    }
}
