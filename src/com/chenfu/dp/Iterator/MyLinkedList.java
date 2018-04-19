package com.chenfu.dp.Iterator;

public class MyLinkedList implements MyCollection{

    private Node head;
    private Node tail;
    private int size = 0;
    @Override
    public void add(Object o) {
        Node n = new Node(o,null);
        if(head==null){
            head=n;
            tail=n;
        }
        tail.next=n;
        tail=n;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyIterator iterator() {
        return new LinkedListIterator();
    }
    private class Node {
        private Object object;
        private Node next;

        public Node(Object object, Node node) {
            this.object = object;
            this.next = node;
        }
    }

    private class LinkedListIterator implements MyIterator {

        private Node n = head;
        @Override
        public Boolean hasNext() {
            if(n!=null){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            Object o = n.object;
            n=n.next;
            return o;
        }
    }

}
