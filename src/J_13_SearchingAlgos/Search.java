package J_13_SearchingAlgos;

public class Search {
    public int linearSearch(int[] array, int target){
        for(int i = 0; i< array.length; i++){
            if(array[i] == target)
                return i;
        }
        return -1;
    }

    public int binarySearch(int[] array, int target){
        return binarySearch(array, target, 0 , array.length-1);
    }
    private int binarySearch(int[] array, int target, int left, int right){
        while(left < right){
            var mid = (left + right)/2;
            if(array[mid] == target)
                return mid;
            else if(array[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public int ternarySearch(int[] array, int target){
        return ternarySearch(array, target, 0, array.length-1);
    }

    private int ternarySearch(int[] array, int target, int left, int right){
        if(left> right)
            return -1;
        int partitionSize = (right-left)/3;
        int mid1 = left +partitionSize;
        int mid2 = right - partitionSize;
        if(array[mid1] == target)
            return mid1;
        if(array[mid2] == target)
            return mid2;
        if(target < array[mid1])
            return ternarySearch(array, target, left, mid1-1);

        if(target > array[mid2])
            return ternarySearch(array, target,mid2+1, right);

        return ternarySearch(array, target, mid1+1, mid2-1);

    }


    public int jumpSearch(int[] array, int target){
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;
        while(start < array.length && array[next-1] < target){
            start = next;
            next += blockSize;
            if(next > array.length)
                next = array.length;
        }
        for(int i = start; i < next; i++) {
            if (array[i] == target)
                return i;
        }
        return -1;

    }

    public int exponentialSearch(int[] array, int target){
        int bound = 1;
        while(bound < array.length && array[bound] < target)
            bound *= 2;

        int left = bound/2;
        int right = Math.min(array.length-1, bound);

        return binarySearch(array,target,left, right );
    }
}
