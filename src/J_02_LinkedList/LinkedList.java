package J_02_LinkedList;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

    }
    private Node first;
    private Node last;
    private int size;

    public void addLast(int value){
        Node newNode = new Node(value);
        if (isEmpty())
            first = last =  newNode;
        else{
            last.next = newNode;
            last = newNode;
        }
        size++;

    }

    public void addFirst(int value){
        Node newNode = new Node(value);
        if(isEmpty())
            first = last = newNode;
        else{
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int value) {
        int index = 0;
        if (isEmpty()) return -1;
        Node cur = first;
        while (cur != null) {
            if(cur.value == value) return index;
            index++;
            cur = cur.next;
        }
        return -1;
    }

    public boolean contains(int value){
        return indexOf(value) != -1;
    }

    public void removeFirst(){
        if( isEmpty()) throw new NoSuchElementException();
        if(first == last){
            first = last = null;
        }else {
            var tmp = first;
            first = first.next;
            tmp.next = null;
        }
        size--;
    }

    public void removeLast(){
        if(isEmpty()) throw  new NoSuchElementException();
        if(first == last) {
            first = last = null;
        }else {
            var prev = getPrev(last);
            prev.next = null;
            last = prev;
        }
        size--;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        int idx = 0;
        var cur = first;
        while(idx < size){
            array[idx] = cur.value;
            cur = cur.next;
            idx++;
        }
        return array;
    }
    private Node getPrev(Node node){
        var cur = first;
        while(cur != null){
            if(cur.next == node) return cur;
            cur = cur.next;
        }
        return null;
    }

    public void reverse(){
        if(isEmpty() || first == last) return;
        var cur = first;
        Node newHead = null;
        while(cur.next != null) {
            var tmp = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = tmp;
        }
        cur.next = newHead;

        last = first;
        first = cur;
    }

    public int getKthNodeFromLast(int k){
        if(isEmpty()) throw new IllegalStateException();
        var cur = first;
        var kth = first;
        for(int i = 0; i < k-1; i++){
            kth = kth.next;
            if(kth == null) throw new IllegalArgumentException();
        }
        while(kth != last){
            cur = cur.next;
            kth = kth.next;
        }
        return cur.value;
    }

    public void printMiddle(){
        Node slow = first;
        Node fast = first;
        while(fast != last & first.next != last){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast == last)
            System.out.println(slow.value);
        else
            System.out.println(slow.value + " " + slow.next.value);
    }
    public boolean hasLoop(){
        Node slow = first;
        Node fast = first;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

}
