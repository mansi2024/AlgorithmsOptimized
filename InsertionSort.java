package sortAlgos;

import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 55, 14, 9, -1};
        sortByInsertion(arr);
    }

    private static void sortByInsertion(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            for(int j = i-1; j >= 0; j--){
                if(temp < arr[j] ){
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    
    
}
