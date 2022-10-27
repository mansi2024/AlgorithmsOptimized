package sortAlgos;

import java.util.Arrays;

public class mergeSort {

    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 55, 14, 9, -1, 3, 5};
        sortbyMerging(arr);
    }

    public static void sortbyMerging(int[] arr) {
        if(arr.length > 1) {
            int[] leftArr = Arrays.copyOfRange(arr, 0, arr.length/2);
            int[] rightArr = Arrays.copyOfRange(arr, arr.length/2, arr.length);
            sortbyMerging(leftArr);
            sortbyMerging(rightArr);
            merge(arr, leftArr, rightArr);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void merge(int[] result, int[] leftArr, int[] rightArr) {
        int i1 = 0, i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if(i2 >= rightArr.length || (i1 < leftArr.length && leftArr[i1] <= rightArr[i2] ) ) {
                result[i] = leftArr[i1];
                i1++;   
            } else {
                result[i] = rightArr[i2];
                i2++;
            }
        }
    }
    
}
