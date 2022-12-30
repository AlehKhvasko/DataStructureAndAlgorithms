package com.khvasko.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
           System.out.println(temp.value);
           temp = temp.next;
       }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
        }else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast(){
        if (length == 0)return null;
        Node temp = head;
        Node previous = head;
        while (temp.next != null){
            previous = temp;
            temp = head.next;
        }
        tail = previous;
        tail.next = null;
        length--;
        if (length == 0){
            tail = null;
            head = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0){
            tail = newNode;
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        head.next = null;
        length--;
        if (length == 0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if (index >  length|| index < 0)return null;
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = head.next;
        }
        return temp;
    }

    public boolean Set(int value, int index){
        Node temp = get(index);
        if (temp != null){
            temp = head.next;
            return true;
        }
        return false;
    }

    public boolean insert(int value, int index){
        if (index < 0 || index > length) return false;
        if (index == 0){
            prepend(value);
        }
        if (index == length){
            append(value);
        }
        Node newNode = new Node(value);
        Node pre = get(index - 1);
        newNode.next = pre.next;
        pre.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if (index >= length || index < 0) return null;
        if (index == length -1) removeLast();
        if (index == 0) removeFirst();

        Node pre = get(index -1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length --;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after;
        for (int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
