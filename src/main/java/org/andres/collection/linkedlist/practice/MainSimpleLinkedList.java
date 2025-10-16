package org.andres.collection.linkedlist.practice;

public class MainSimpleLinkedList {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.createSimpleLinkedList();

        System.out.println(list.toString());

        list.append(new Node(4));
        System.out.println(list.toString());

        list.add(new Node(0), 0);
        System.out.println(list.toString());

        list.add(new Node(5), 2);
        System.out.println(list.toString());

        list.delete(2);
        System.out.println(list.toString());
    }
}
