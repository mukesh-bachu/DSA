package J_12_SortingAlgos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] nums = {7,3,1,4,6,2,3};

        //testing bubbleSort
        var sorter = new BubbleSort();
        sorter.sort(nums);
        System.out.println(Arrays.toString(nums));


        //testing selection sort
        int[] nums1 = {7,3,1,4,6,2,3};
        var sorter1 = new SelectionSort();
        sorter1.sort(nums1);
        System.out.println(Arrays.toString(nums1));


        //testing insertion sort
        int[] nums2 = {7,3,1,4,6,2,3};
        var sorter2 = new InsertionSort();
        sorter2.sort(nums2);
        System.out.println(Arrays.toString(nums2));

        //testing merge sort
        int[] nums3 = {7,3,1,4,6,2,3};
        var sorter3 = new MergeSort();
        sorter3.sort(nums3);
        System.out.println(Arrays.toString(nums3));


        //testing quick sort
        int[] nums4 = {7,3,1,4,6,2,3};
        var sorter4 = new QuickSort();
        sorter4.sort(nums4);
        System.out.println(Arrays.toString(nums4));


        //testing counting sort
        int[] nums5 = {7,3,1,4,6,2,3};
        var sorter5 = new CountingSort();
        sorter5.sort(nums5);
        System.out.println(Arrays.toString(nums5));

        //testing bucket sort
        int[] nums6 = {7,3,1,4,6,2,3};
        var sorter6 = new BucketSort();
        sorter6.sort(nums6, 3);
        System.out.println(Arrays.toString(nums6));




    }
}
