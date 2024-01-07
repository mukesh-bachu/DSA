package J_08_Heaps;

public class PriorityQueueWithHeap {
    private Heap heap = new Heap();
    public void add(int val){
        heap.insert(val);
    }

    public int remove(){
        return heap.remove();
    }

    public boolean isEmpty(){
        return heap.isEmpty();
    }
}
