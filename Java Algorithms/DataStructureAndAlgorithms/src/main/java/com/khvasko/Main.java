package com.khvasko;

import com.khvasko.linkedlist.LinkedList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.printList();
        linkedList.reverse();
        linkedList.printList();

    }



}
