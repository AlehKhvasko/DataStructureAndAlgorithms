package com.khvasko.queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node{
        int value;
        int next;
        Node(int value){
            this.value = value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }
}
