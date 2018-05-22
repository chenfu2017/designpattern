package com.chenfu.dp.strategy;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {

        int[] arr = {49,38,65,97,76,13,27,49,55,4};
        AbstractSort sort = new MergeSort();
        Context context = new Context(sort);
        System.out.println("排列前:"+Arrays.toString(arr));
        context.sort(arr);
        System.out.println("排列后:"+Arrays.toString(arr));

    }
}
