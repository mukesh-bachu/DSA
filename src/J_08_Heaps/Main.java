package J_08_Heaps;
import java.util.*;
public class Main {
    public static void main(String[] args){
        var heap = new Heap();
        heap.insert(10);
        heap.insert(5);
        heap.insert(17);
        heap.insert(4);
        heap.insert(22);

        System.out.println(heap.remove());

        System.out.println("Done");

        //testing heapify
        int[] nums = {5,3,8, 4, 1, 2};
        MaxHeap.heapify(nums);
        System.out.println(Arrays.toString(nums));

        int[] nums1 = {5,3,8, 4, 1, 2};
        System.out.println(MaxHeap.getKthLargest(nums1, 2));


        //testing isMaxHeap
        System.out.println(Heap.isMaxHeap(nums));
        System.out.println(Heap.isMaxHeap(nums1));

        //testing MinHeap
        var heap1 = new MinHeap(10);
        heap1.insert(10, "a");
        heap1.insert(5,"b");
        heap1.insert(17,"c");
        heap1.insert(4,"d");
        heap1.insert(22,"e");

        System.out.println(heap1.remove());

        System.out.println("Done");

        //testing Min Priority Queue


        var pq2 = new MinPriorityQueue(10);
        pq2.add( "a", 10);
        pq2.add("b", 1);
        pq2.add("c", 2);
        pq2.add("d", 3);
        pq2.add("e", 5);

        System.out.println(pq2.remove());

        System.out.println("Done");


    }
}
