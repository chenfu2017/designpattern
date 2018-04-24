package com.chenfu.dp.strategy;

public class HeapSort extends AbstractSort {

     private int len;

     private void buildMaxHeap(int arr[]) {
        len = arr.length;
        for (int i = (int)Math.floor(len/2); i >= 0; i--) {
            heapify(arr, i);
        }
    }

    private void heapify(int arr[],int i) {
        int left = 2 * i + 1,
            right = 2 * i + 2,
            largest = i;

        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest);
        }
    }
    @Override
    void sort(int[] arr) {
        buildMaxHeap(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            len--;
            heapify(arr, 0);
        }
    }
}
