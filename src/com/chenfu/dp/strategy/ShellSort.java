package com.chenfu.dp.strategy;

public class ShellSort extends AbstractSort {
    @Override
    void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int len = arr.length;
        int h = 1;
        while (h <= len / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int k = 0; k < h; k++) {
                for (int i = h + k; i < arr.length; i += h) {
                    if (arr[i - h] > arr[i]) {
                        int tmp = arr[i];
                        int j = i - h;
                        while (j >= 0 && arr[j] > tmp) {
                            arr[j + h] = arr[j];
                            j -= h;
                        }
                        arr[j + h] = tmp;
                    }
                }
            }
            h = (h - 1) / 3;
        }
    }
}