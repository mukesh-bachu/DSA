package J_12_SortingAlgos;

public class SelectionSort {
    public void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            var minIdx = i;
            for(int j = i; j<array.length;j++){
                if(array[j] < array[minIdx])
                    minIdx = j;
            }
            swap(array,i,minIdx);
        }
    }
    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
