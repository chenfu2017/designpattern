package com.chenfu.dp.strategy;

public class MergeSort extends AbstractSort {
    @Override
    void sort(int[] arr) {
        Msort(arr,0,arr.length-1);
    }

    private void  Msort(int[] arr,int low,int high) {
        if(low==high){
            return;
        }
        int mid = (low+high)/2;
        Msort(arr,low,mid);
        Msort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i= low;
        int j = mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        while(i<=mid){
            temp[k++] = a[i++];
        }
        while(j<=high){
            temp[k++] = a[j++];
        }
        for(int x=0;x<temp.length;x++){
            a[x+low] = temp[x];
        }
    }
}
