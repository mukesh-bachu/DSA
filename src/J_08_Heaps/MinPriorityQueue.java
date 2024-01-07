package J_08_Heaps;

public class MinPriorityQueue {

    private MinHeap items;
    public MinPriorityQueue(int capacity){
        this.items = new MinHeap(capacity);
    }

    public void add(String value, int key){
        items.insert(key, value);
    }

    public String remove(){
        return items.remove();
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }
}
