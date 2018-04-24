package com.chenfu.dp.strategy;

public class BinaryInsertSort extends AbstractSort {
    @Override
    void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int tmp = arr[i];
                int low = 0;
                int high = i - 1;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    if (arr[mid] < tmp) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                for (int j = i; j > low; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[low] = tmp;
            }
        }
    }
}
