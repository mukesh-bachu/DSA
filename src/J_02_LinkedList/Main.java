package J_02_LinkedList;

import java.util.Arrays;

public class Main {
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
        list.reverse();
        array = list.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(list.getKthNodeFromLast(1));
        list.printMiddle();
    }
}
