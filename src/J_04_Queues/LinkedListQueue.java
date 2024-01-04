package J_04_Queues;

import J_02_LinkedList.LinkedList;

import java.util.ArrayList;

public class LinkedListQueue {
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    //O(1)
    public boolean isEmpty(){
        return head == null;
    }
    //O(1)
    public int size(){
        return count;
    }
    //O(1)
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        return head.value;
    }
    //O(1)
    public void enqueue(int val){
        Node newNode = new Node(val);
        if(isEmpty()){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    //O(1)
    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();
        int top;
        if(head == tail) {
            top = head.value;
            head = tail = null;
        }else {
            top = head.value;
            Node newHead = head.next;
            head.next = null;
            head = newHead;
        }
        count--;
        return top;
    }

    @Override
    public String toString(){
        ArrayList<Integer> list = new ArrayList<>();
        Node cur = head;
        while(cur != null){
            list.add(cur.value);
            cur = cur.next;
        }
        return list.toString();
    }


}
