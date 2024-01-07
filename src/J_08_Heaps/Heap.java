package J_08_Heaps;

import java.util.Arrays;

public class Heap {

    private int[] items = new int[10];
    private int size;

    public void insert(int val){
        if(isFull())
            throw new IllegalStateException();
        items[size++] = val;
        bubbleUp();
    }

    public boolean isFull(){
        return size == items.length;
    }

    private void bubbleUp(){
        var idx = size -1;
        var parentIdx = getParentIdx(idx);
        while(idx > 0 && items[idx] > items[parentIdx]) {
            swap(idx, parentIdx);
            idx = parentIdx;
            parentIdx = getParentIdx(idx);
        }
    }

    private int getParentIdx(int idx){
        return (idx - 1)/2;
    }
    private void swap(int first, int second){
        var temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();
        var root = items[0];
        items[0] = items[--size];
        bubbleDown();
        return root;
    }

    public int max(){
        if(isEmpty())
            throw new IllegalStateException();
        return items[0];
    }

    public boolean isEmpty(){
        return size == 0;
    }
    private void bubbleDown(){
        var idx = 0;
        while(idx <= size && !isValidParent(idx)){
            var largerChildIdx = largerChildIdx(idx);
            swap(idx, largerChildIdx);
            idx = largerChildIdx;
        }
    }

    private int largerChildIdx(int idx){
        if(!hasLeftChild(idx))
            return idx;
        if(!hasRightChild(idx))
            return leftChildIdx(idx);
        return  (leftChild(idx) > rightChild(idx) )?
                leftChildIdx(idx) : rightChildIdx(idx);
    }

    private boolean hasLeftChild(int idx){
        return leftChildIdx(idx) <= size;
    }

    private boolean hasRightChild(int idx){
        return rightChildIdx(idx) <= size;
    }


    private boolean isValidParent(int idx){

        if(!hasLeftChild(idx))
            return true;

        var isValid = items[idx] >= leftChild(idx);

        if(!hasRightChild(idx))
            isValid &= items[idx] >= rightChild(idx);;
        return isValid;

    }

    private int leftChild(int idx){
        return items[leftChildIdx(idx)];
    }

    private int rightChild(int idx){
        return items[rightChildIdx(idx)];
    }

    private int leftChildIdx(int idx){
        return idx*2 + 1;
    }

    private int rightChildIdx(int idx){
        return idx*2 + 2;
    }


    public static boolean isMaxHeap(int[] array){
        for(int i = 0; i < (array.length/2) - 1; i++){
            if(!isValidParent(array, i)){
                return false;
            }
        }
        return true;
    }
    private static boolean isValidParent(int[] array, int idx){
        var isVallid = true;
        var leftChildIdx = 2*idx + 1;
        if(leftChildIdx < array.length)
            isVallid &= array[idx] >= array[leftChildIdx];
        var rightChildIdx = 2*idx + 2;
        if(rightChildIdx < array.length)
            isVallid &= array[idx] >= array[rightChildIdx];
        return isVallid;
    }


}
