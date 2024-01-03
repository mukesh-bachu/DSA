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


    public static void  main(String[] args){
        LinkedList list = new LinkedList();
        System.out.println(list.size());
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        System.out.println(list.size());
        System.out.println(list.indexOf(1));
        System.out.println(list.indexOf(3));
        list.addFirst(10);
        list.addFirst(20);
        System.out.println(list.size());
        System.out.println(list.indexOf(1));
        System.out.println(list.indexOf(40));
        list.removeFirst();
        System.out.println(list.size());
        System.out.println(list.indexOf(20));
        System.out.println(list.contains(1));
        list.removeLast();
        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(array));


    }

}
