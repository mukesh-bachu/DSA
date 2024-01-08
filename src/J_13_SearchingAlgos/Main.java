package J_13_SearchingAlgos;

import java.util.*;
public class Main {

    public static void main(String[] args){

        //testing linear search
        int[] nums = {7,1,3,6,5};
        var search = new Search();
        var idx = search.linearSearch(nums, 6);
        System.out.println(idx);

        Arrays.sort(nums);//{1,3,5,6,7}
        //testing binary search
        idx = search.binarySearch(nums, 6);
        System.out.println(idx);


        //testing ternary search
        idx = search.ternarySearch(nums, 6);
        System.out.println(idx);

        //testing jump search
        idx = search.jumpSearch(nums, 6);
        System.out.println(idx);

        //testing exponential search
        idx = search.exponentialSearch(nums, 61);
        System.out.println(idx);




    }
}
