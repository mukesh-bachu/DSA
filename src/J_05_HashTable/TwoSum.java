package J_05_HashTable;

import java.util.*;

public class TwoSum {
    public String twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            int diff = target - array[i];
            if (map.containsKey(diff)) {
                result[0] = i;
                result[1] = map.get(diff);
                return result.toString();
            }
            map.put(array[i], i);
        }
        return result.toString();
    }
}
