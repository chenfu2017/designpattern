package com.chenfu.dp.strategy;

public class QuickSort extends AbstractSort {
    @Override
    public void sort(int[] arr) {
        if(arr.length>0) {
            quickSort(arr, 0 , arr.length-1);
        }
    }

    private void quickSort(int[] arr, int low, int high) {
        if(low > high) return;
        int i = low;
        int j = high;
        int key = arr[low];
        while (i < j) {
            while (i < j && key <= arr[j]) {
                j--;
            }
            while (i < j && key >= arr[i]) {
                i++;
            }
            if (i < j) {
                swap(arr,i,j);
            }
        }
        swap(arr,i,low);
        quickSort(arr, low, i-1 );
        quickSort(arr, i+1, high);
    }
}
