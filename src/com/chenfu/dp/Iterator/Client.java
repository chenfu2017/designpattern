package com.chenfu.dp.Iterator;

public class Client {

    public static void main(String[] args) {
        MyCollection list = new MyArrayList();
        list = new MyLinkedList();
        list.add("aaa");
        list.add("car");
        list.add(111);
        list.add('c');
        list.add(1.2);
        list.add(new Dog("wangcai"));
        for (MyIterator iterator = list.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
        System.out.println(list.size());
    }
}
