package J_01_Array;

import java.util.*;

public class Array {
    private int[] items;
    private int count;
    public Array(int length){
        items = new int[length];
    }

    public void insert(int val){
        if (items.length == count) {
            int[] newItems = new int[2 * count];
            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = val;

    }
    public void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }

        for(int i = index; i < count; i++){
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int val){
        for(int i = 0; i < count; i++){
            if(items[i] == val) return i;
        }
        return -1;
    }

    public int max(){
        int max = Integer.MIN_VALUE;
        for(int val: items){
            max = Integer.max(max, val);
        }
        return max;
    }

    public void interect(int[] items1){
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int item: items)
            set.add(item);
        for(int item: items1){
            if(set.contains(item)) result.add(item);
        }
        if ( result.size() >0) {
            for (int item : result) {
                System.out.println(item);
            }
        }else{
            System.out.println("no common elements");
        }

    }

    public void reverse(){
        int left =0;
        int right = count -1;
        while(left < right){
            int tmp = items[left];
            items[left++] = items[right];
            items[right--] = tmp;

        }
    }

    public void insertAt(int item, int index){
        if (items.length == count) {
            int[] newItems = new int[2 * count];
            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        if(index < 0 || index >= count+1)
            throw new IllegalArgumentException();
        for(int i = count; i > index; i--){
            items[i] = items[i-1];
        }
        items[index] = item;
        count++;
    }

    public void print(){
        for(int i = 0; i < count; i++)
            System.out.print(items[i] + " ");
        System.out.println();
    }
}
