package com.chenfu.dp.strategy;

import com.chenfu.dp.strategy.AbstractSort;

public class SelectionSort extends AbstractSort {
    @Override
    void sort(int[] arr) {
        int temp;
        for (int i=0 ; i< arr.length-1 ; i++)
        {
            int index=i;
            for (int j=i+1 ; j < arr.length ; j++)
            if (arr[j] < arr[index] )
                index=j;
            if ( index!=i)
            {
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
}
