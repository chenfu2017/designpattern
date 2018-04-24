package com.chenfu.dp.strategy;

public abstract class AbstractSort {

    abstract void sort(int arr[]);

    protected void swap(int[] arr,int i ,int j){
        int p = arr[i];
        arr[i] = arr[j];
        arr[j] = p;
    };
}
