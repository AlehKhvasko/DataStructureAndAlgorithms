package com.khvasko;

import com.khvasko.binarysearchtree.BinarySearchTree;
import com.khvasko.doublyLinkedList.DoublyLinkedList;
import com.khvasko.hashtable.HashTable;
import com.khvasko.linkedlist.LinkedList;
import com.khvasko.queue.Queue;
import com.khvasko.quicksort.QuickSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;

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
//        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(2);
//        doublyLinkedList.append(3);
//        doublyLinkedList.append(4);
//        System.out.println(doublyLinkedList.removeLast());
//        doublyLinkedList.printDoublyLinkedList();

        Queue queue = new Queue(3);
        queue.enqueue(4);
        queue.printQueue();

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(21);
        binarySearchTree.insert(2);
        binarySearchTree.insert(4);
        binarySearchTree.insert(7);
        System.out.println("bst contains 7 is: " + binarySearchTree.contains(7));
        System.out.println("bst contains 8 is: " + binarySearchTree.contains(8));

        HashTable hashTable = new HashTable();
        hashTable.set("nails", 20);
        hashTable.set("washers", 15);
        hashTable.set("screws", 115);
        hashTable.printTable();
        System.out.println(hashTable.keys());


        int[] randomNums = {4, 2, 1, 7, 0, 1, 4, 3, 0};
        QuickSort.quickSort(randomNums);
        System.out.println(Arrays.toString(randomNums));
    }

}
