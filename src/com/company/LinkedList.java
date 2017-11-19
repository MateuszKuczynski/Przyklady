package com.company;

public class LinkedList implements List {
    private Node first;

    @Override
    public void add(double a) {
        if (first == null) {
            first = new Node(a);
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }

            current.next = new Node(a);
        }
    }

    private Node getNode(int pos) {
        if (pos < 0 || first == null) {

        }
        Node current = first;
        for (int i = 0; i < pos; ++i) {
            if (current == null) {
                throw new IndexOutOfBoundsException();
            }
            current = current.next;
        }
        return current;
    }

    @Override
    public double get(int pos) {
        return getNode(pos).value;
    }

    @Override
    public void remove(int pos) {
        if (first == null) {
            throw new IndexOutOfBoundsException();
        }

        if (pos == 0) {
            first = first.next;
        }

        Node beforeRemoved = getNode(pos);

        beforeRemoved.next = beforeRemoved.next.next;
    }

    @Override
    public int size() {
        if (first == null) {
            return 0;
        } else {
            Node current = first;
            int size = 0;
            while (current.next != null) {
                current = current.next;
                ++size;
            }
        }
        return size();
    }

    private static class Node {
        public double value;
        public Node next;

        public Node(double value) {
            this.value = value;
        }

        public Node(double value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
