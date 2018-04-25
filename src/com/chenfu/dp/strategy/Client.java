package com.chenfu.dp.strategy;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {

        int[] arr = {7, 3, 4, 5, 2, 8, 1, 9, 0};
        AbstractSort sort = new ShellSort();
        Context context = new Context(sort);
        System.out.println("排列前:"+Arrays.toString(arr));
        context.sort(arr);
        System.out.println("排列后:"+Arrays.toString(arr));

    }
}
