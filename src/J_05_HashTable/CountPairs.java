package J_05_HashTable;

import java.util.*;

public class CountPairs {
    public int countPairsWithDifferenceK(int[] nums, int k){
        Set<Integer> set = new HashSet<>();
        for(int i: nums)
            set.add(i);
        int count = 0;
        for(int i : nums){
            if(set.contains(i - k))
                count++;
            if(set.contains(i+k))
                count++;
            set.remove(i);
        }
        return count;
    }
}
