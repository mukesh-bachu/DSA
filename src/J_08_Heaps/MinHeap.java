package J_08_Heaps;

public class MinHeap {
    private class Node{
        private int key;
        private String value;

        public Node (int key, String value){
            this.key = key;
            this.value = value;
        }
    }

    private Node[] items;
    private int size;
    private int capacity;

    public MinHeap(int capacity){
        this.items = new Node[capacity];
        this.capacity = capacity;
    }

    public boolean isFull(){
        return (size == capacity);
    }

    public void insert(int key, String value){
        if(isFull())
            throw new IllegalStateException();

        items[size++] = new Node(key, value);
        bubbleUp();
    }

    public String remove(){
        if(isEmpty())
            throw new IllegalStateException();
        var result = items[0].value;
        items[0] = items[--size];
        bubbleDown();
        return result;
    }

    private void bubbleDown(){
        var idx = 0;
        while(idx < size && !isValidParent(idx)) {
            var smallerIdx = idx;
            var leftIdx = leftIdx(idx);
            var rightIdx = rightIdx(idx);
            if(leftIdx < size && items[leftIdx].key < items[smallerIdx].key )
                smallerIdx = leftIdx;
            if(rightIdx(idx) < size && items[rightIdx].key < items[smallerIdx].key )
                smallerIdx = rightIdx;
            if(idx == smallerIdx)
                return;
            swap(smallerIdx,idx);
            idx = smallerIdx;
        }
    }

    private boolean isValidParent(int idx){
        var isValid = true;
        if(leftIdx(idx) < size)
            isValid &= items[idx].key <= items[leftIdx(idx)].key;
        if(rightIdx(idx) < size)
            isValid &= items[idx].key <= items[rightIdx(idx)].key;

        return isValid;
    }

    private int leftIdx(int idx){
        return 2*idx + 1;
    }

    private int rightIdx(int idx){
        return 2*idx + 2;
    }

    public boolean isEmpty(){
        return size==0;
    }

    private void bubbleUp(){
        var idx = size - 1;
        var parentIdx = parentIdx(idx);
        while(parentIdx >=0 && items[parentIdx].key > items[idx].key) {
            swap(idx, parentIdx);
            idx = parentIdx;
            parentIdx = parentIdx(idx);
        }
    }



    private void swap(int first, int second){
        var temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    private int parentIdx(int idx){
        return (idx - 1)/2;
    }
}
