package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList implements List<Object> {
    private static int range = 10;
    private static Object[] array = new Object[range];
    private int count = 0;

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < count; i++)
            if (array[i] == o)
                return true;
        return false;
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    @Override
    public Object[] toArray() {
        Object[] copy = array;
        return copy;
    }

    @Override
    public Object[] toArray(Object[] a) {
        a = new Object[count];
        for (int i = 0; i < count; i++)
            a[i] = array[i];
        return a;
    }

    @Override
    public boolean add(Object o) {
        if (count == range - 1) {
            int oldRange = range;
            range = range + 5;
            Object[] copy = new Object[range];
            for (int i = 0; i < oldRange; i++) {
                copy[i] = array[i];
            }
            copy[count] = o;
            count++;
            array = copy;

        } else {
            array[count] = o;
            count++;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        boolean remove = false;
        for (int i = 0; i <= size(); i++) {
            if (array[i] == o) {
                array[i] = null;
                remove = true;
            }
        }
        return remove;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object item : c)
            add(item);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        for (Object item : c) {
            add(index, item);
            index++;
        }
        return true;
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
        if (count == range - 1) {
            int oldRange = range;
            range = range + 5;
            Object[] copy = new Object[range];
            for (int i = 0; i < oldRange; i++) {
                copy[i] = array[i];
            }
            copy[count] = element;
            count++;
            array = copy;

        } else {
            for (int i = 0; i <= count; i++) {
                if (i >= index) {
                    Object o = array[i];
                    array[i] = element;
                    element = o;
                }
            }
        }
        count++;
    }

    @Override
    public Object remove(int index) {
        array[index] = null;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        for (int i = 0; i <= size(); i++) {
            if (array[i] == o) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = 0; i <= size(); i++) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return new ArrayListListIterator();
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        List<Object> subList = new java.util.ArrayList<>();
        for (int i = fromIndex; i <= toIndex; i++) {
            subList.add(array[i]);
        }
        return subList;
    }

    @Override
    public boolean retainAll(Collection c) {
        boolean remove = false;
        for (Object e : c) {
            for (int i = 0; i <= size(); i++) {
                if (array[i] != e) {
                    array[i] = null;
                    remove = true;
                }
            }
        }
        return remove;
    }

    @Override
    public boolean removeAll(Collection c) {
        for (Object e : c)
            if (!remove(e))
                return false;
        return true;

    }

    @Override
    public boolean containsAll(Collection c) {
        for (Object item : c)
            if (contains(item))
                return false;
        return true;
    }


    private static class ArrayListIterator implements Iterator<Object> {
        int nextIndex = 0;
        int index = 0;

        @Override
        public boolean hasNext() {
            if (array[nextIndex] != null) {
                nextIndex++;
                index = nextIndex--;
                return true;
            } return false;
        }

        @Override
        public Object next() {
            return array[nextIndex];
        }
    }

    private static class ArrayListListIterator implements ListIterator {
        int nextIndex = 0;
        int index = 0;
        int previousIndex = 0;

        @Override
        public boolean hasNext() {
            if (array[nextIndex] == null) {
                return false;
            } else {
                nextIndex++;
                index = nextIndex--;
                previousIndex = index--;
                return true;
            }
        }

        @Override
        public Object next() {
            return array[nextIndex];
        }

        @Override
        public boolean hasPrevious() {
            if (array[previousIndex] == null) {
                return false;
            } else {
                previousIndex--;
                index = previousIndex++;
                nextIndex = index++;
                return true;
            }
        }

        @Override
        public Object previous() {
            return array[previousIndex];
        }

        @Override
        public int nextIndex() {
            return nextIndex;
        }

        @Override
        public int previousIndex() {
            return previousIndex;
        }

        @Override
        public void remove() {
            array[index] = null;
        }

        @Override
        public void set(Object o) {
            array[index] = o;
        }

        @Override
        public void add(Object o) {
            for (int i = 0; i <= array.length; i++) {
                if (i >= index) {
                    Object e = array[i];
                    array[i] = o;
                    o = e;
                }

            }
        }
    }
}
