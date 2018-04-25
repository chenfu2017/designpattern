package com.chenfu.dp.strategy;

public class ShellSort extends AbstractSort{
    @Override
    void sort(int[] arr) {
        int N = arr.length;
        int h = 1;
        while (h < N) h = h * 3 + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && arr[j] < arr[j - h]; j -= h ) {
                    swap(arr, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
