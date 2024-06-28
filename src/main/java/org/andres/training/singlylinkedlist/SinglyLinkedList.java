package org.andres.training.singlylinkedlist;

public class SinglyLinkedList {
    // represent the head and tail of the singly linked list
    Node head = null;
    Node tail = null;

    // Represent a node of the singly linked list
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * addNode will add a new node to the list
     */
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) { // check if the list is empty
            head = newNode;

        } else {
            tail.next = newNode;    // newNode will be added after tail such that tail's next will point to newNode
        }
        tail = newNode;             // newNode will become new tail of the list
    }

    /**
     * display, will display all the nodes present in the list
     */
    public void displayList() {
        Node current = head;    // Node current will point to head
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        // add nodes to the list
        singlyLinkedList.addNode(1);
        singlyLinkedList.addNode(2);
        singlyLinkedList.addNode(3);
        singlyLinkedList.addNode(4);

        // displays the nodes present in the list
        singlyLinkedList.displayList();
    }
}
