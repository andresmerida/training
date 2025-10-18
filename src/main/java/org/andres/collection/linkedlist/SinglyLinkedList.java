package org.andres.collection.linkedlist;

import java.util.NoSuchElementException;
import java.util.Objects;

public class SinglyLinkedList<E> {
    transient int size = 0;
    Node<E> head;

    SinglyLinkedList() {
        head = null;
    }

    void append(E element) {
        Node<E> current = head;
        if (current == null) {
            this.head = new Node<>(element);
        } else {
            while(current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(element);
        }
        size++;
    }

    void add(E element, int index) {
        checkPositionIndex(index);
        Node<E> current = head;
        Node<E> newNode = new Node<>(element);

        if (index == 0) {
            newNode.next = current;
            this.head = newNode;
        } else {
            for(int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    E delete(int index) {
        checkPositionIndex(index);
        Node<E> current = head;
        Node<E> previous = null;
        E deleteValue;

        if (index == 0) {
            deleteValue = current.element;
            this.head = current.next;
        } else {
            for(int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            deleteValue = current.element;
            Objects.requireNonNull(previous).next = current.next;
        }
        size--;

        return deleteValue;
    }

    E getFirst() {
        final Node<E> current = head;
        if (current == null) {
            throw new NoSuchElementException();
        }

        return current.element;
    }

    E get(int index) {
        checkPositionIndex(index);
        return getNode(index).element;
    }

    E getLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }

        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public String toString() {
        Node<E> current = head;
        StringBuilder sb = new StringBuilder("[");
        while (current != null) {
            sb.append(current.element).append(",");
            current = current.next;
        }
        if (size != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        sb.append("]");
        return sb.toString();
    }

    void checkPositionIndex(int index) {
        if (!isPositionIndex(index)) {
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index < size;
    }

    private Node<E> getNode(int index) {
        checkPositionIndex(index);
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        Node(E element) {
            this.element = element;
            this.next = null;
        }
    }
}


