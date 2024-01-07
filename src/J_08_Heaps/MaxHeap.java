package J_08_Heaps;

public class MaxHeap {
    public static void heapify(int[] array){
        var lastParentIdx = array.length/2 - 1;
        for(int i = lastParentIdx; i >=0; i--)
            heapify(array, i);
    }
    private static void heapify(int[] array, int idx){
        var largerIdx = idx;
        var leftIdx = 2*idx + 1;
        if(leftIdx < array.length && array[leftIdx] > array[largerIdx]){
            largerIdx = leftIdx;
        }
        var rightIdx = 2*idx + 2;
        if(rightIdx < array.length && array[rightIdx] > array[largerIdx]){
            largerIdx = rightIdx;
        }
        if(idx == largerIdx)
            return;

        swap(array, largerIdx,idx);
        heapify(array, largerIdx);


    }

    private static void swap(int[] array, int first, int second){
        var tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }

    public static int getKthLargest(int[] array, int k){
        if(k < 1 || k> array.length)
            throw new IllegalArgumentException();
        var heap = new Heap();
        for(var number: array)
            heap.insert(number);


        while(k > 1) {
            heap.remove();
            k--;
        }

        return heap.max();
    }


}
