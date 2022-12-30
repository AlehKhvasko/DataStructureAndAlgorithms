package com.khvasko.doublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;


    class Node {
        Node next;
        Node previos;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
}
