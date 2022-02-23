package com.bridgeLabz.queue;

import com.bridgeLabz.linkedList.LinkedList;
import com.bridgeLabz.linkedList.Node;

public class Queue {
    private Node top;
    private LinkedList linkedList;

    public Queue() {
        this.linkedList = new LinkedList();
    }

    public void enqueue() {
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
}

