package com.khvasko;

import com.khvasko.doublyLinkedList.DoublyLinkedList;
import com.khvasko.linkedlist.LinkedList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
//        LinkedList linkedList = new LinkedList(1);
//        linkedList.append(2);
//        linkedList.append(3);
//        linkedList.append(4);
//        linkedList.printList();
//        linkedList.reverse();
//        linkedList.printList();

        //Doubly linkedList
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        System.out.println(doublyLinkedList.removeLast());
        doublyLinkedList.printDoublyLinkedList();
    }


}
