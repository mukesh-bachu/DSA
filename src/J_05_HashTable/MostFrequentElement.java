package J_05_HashTable;

import java.util.*;

public class MostFrequentElement {
    public int mostFrequentElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int element = 0;
        for(int i: nums){
            int count = map.containsKey(i)?map.get(i):0;
            map.put(i, count + 1);
            if(max < map.get(i)){
                max = count +1;
                element = i;
            }
        }
        return element;
    }
}
