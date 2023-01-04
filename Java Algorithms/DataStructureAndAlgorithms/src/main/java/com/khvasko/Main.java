package com.khvasko;

import com.khvasko.doublyLinkedList.DoublyLinkedList;
import com.khvasko.linkedlist.LinkedList;
import com.khvasko.queue.Queue;
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
//        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(2);
//        doublyLinkedList.append(3);
//        doublyLinkedList.append(4);
//        System.out.println(doublyLinkedList.removeLast());
//        doublyLinkedList.printDoublyLinkedList();

        Queue queue = new Queue(3);
        queue.enqueue(4);
        queue.printQueue();

        class Solution {
            public int pivotIndex(int[] nums) {
                int sum = 0, leftsum = 0;
                for (int x: nums) sum += x;
                for (int i = 0; i < nums.length; ++i) {
                    if (leftsum == sum - leftsum - nums[i]) return i;
                    leftsum += nums[i];
                }
                return -1;
            }
        }
        int [] nums = {7,2,-5,2,-1,2};
        Solution solution = new Solution();
        System.out.println("pivot");
        System.out.println(solution.pivotIndex(nums));
    }


}
