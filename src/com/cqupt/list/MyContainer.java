package com.cqupt.list;

import java.util.Iterator;

public class MyContainer<E> implements Iterable {
    Object[] elements;


    public MyContainer() {
        elements = new Byte[10];
        for(int i =0;i<10;i++){
            elements[i] = (byte)i;
        }
    }


    private class itr<E> implements Iterator<E> {
        private int position = -1;
        private Object[] data = elements;

        @Override
        public E next() {
            return (E)data[position];
        }

        @Override
        public boolean hasNext() {
            return ++position<data.length;
        }


    }

    @Override
    public Iterator iterator() {
        return new itr();
    }
}
