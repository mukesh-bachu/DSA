package J_12_SortingAlgos;

public class InsertionSort {
    public void sort(int[] array){
        for(int i = 1; i < array.length; i++){
            var cur = array[i];
            int j = i - 1;
            while(j>= 0 && array[j]> cur){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = cur;
        }
    }

}
