package org.andres.collection.linkedlist.practice;

public class SimpleLinkedList {
    Node head;

    SimpleLinkedList() {
        this.head = null;
    }

    public void createSimpleLinkedList() {
        Node node1 = new Node(1);
        this.head = node1;

        Node node2 = new Node(2);
        node1.next = node2;

        node2.next = new Node(3);
    }

    public void append(Node newNode) {
        Node current = this.head;
        if (current != null) {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        } else {
            this.head = newNode;
        }
    }

    public void add(Node newNode, int index) {
        Node current = this.head;
        if (index == 0) {
            newNode.next = current;
            this.head = newNode;
        } else {
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    public int delete(int index) {
        Node current = this.head;
        Node previous = null;
        int deletedValue = -1;

        if (index == 0) {
            deletedValue = this.head.data;
            this.head = this.head.next;
        } else {
            for (int i = 0; i < index && current != null; i++) {
                previous = current;
                current = current.next;
            }
            if (current != null) {
                deletedValue = current.data;
                previous.next = current.next;
            }
        }

        return deletedValue;
    }

    @Override
    public String toString() {
        Node current = this.head;
        StringBuilder s = new StringBuilder("[");
        while (current != null) {
            s.append(current.data).append(",");
            current = current.next;
        }
        s.deleteCharAt(s.length() - 1);
        s.append("]");

        return s.toString();
    }
}
