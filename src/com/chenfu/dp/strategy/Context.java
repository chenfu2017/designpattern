package com.chenfu.dp.strategy;

public class Context {
    private AbstractSort abstractSort;

    public Context(AbstractSort abstractSort) {
        this.abstractSort = abstractSort;
    }

    public AbstractSort getAbstractSort() {
        return abstractSort;
    }

    public void setAbstractSort(AbstractSort abstractSort) {
        this.abstractSort = abstractSort;
    }

    public void sort(int arr[]) {
        abstractSort.sort(arr);
    }
}
