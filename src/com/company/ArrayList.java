package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList implements List {
    static int range = 1;
    Object[] array = new Object[range];
    int count = 0;

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (count == 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean contains(Object o) {
        boolean contains = false;
        for (int i = 0; i <= size();i++){
            if (array[i] == o) {
                contains = true;
            }
        }
        return contains;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (count == range - 1){
            int oldRange = range;
            range = range + 5;
            Object [] copy = new Object[range];
            for (int i = 0; i < oldRange; i++){
                copy[i] = array[i];
            }
            copy[count] = o;
            count++;
            array = copy;

        }
        else {
            array[count] = o;
            count++;
        }
        return true;    }

    @Override
    public boolean remove(Object o) {
        boolean remove = false;
        for (int i = 0; i <= size();i++){
            if (array[i] == o) {
                array[1] = null;
                remove = true;
            }
        }
        return remove;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        count = 0;
        array = null;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object set(int index, Object element) {
        array[index] = element;
        return element;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        array[index] = null;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        for (int i = 0; i <= size();i++){
            if (array[i] == o) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = 0; i <= size();i++){
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
