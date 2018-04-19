package com.chenfu.dp.Iterator;

import java.util.Arrays;

public class MyArrayList implements MyCollection {

    private int initSize = 5;

    private Object[] objects = new Object[initSize];

    private int index = 0;
    @Override
    public void add(Object o) {
        if(index==objects.length){
            objects=Arrays.copyOf(objects,objects.length*2);
        }
        objects[index]=o;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public MyIterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements MyIterator{

        private int currentIndex = 0;
        @Override
        public Boolean hasNext() {
            if(currentIndex>=index){
                return false;
            }
            return true;
        }

        @Override
        public Object next() {
            Object o = objects[currentIndex];
            currentIndex++;
            return o;
        }
    }
}
