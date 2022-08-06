package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList implements List<Name> {
    private static int range = 10;
    private static Name[] array = new Name[range];
    private int count = 0;

    /**
     *
     * @return  длинну массива
     */
    public int lenth(){
        return array.length;
    }

    /**
     *  метод возвращает колличество элементов
     * @return
     */
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
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    @Override
    public Name[] toArray() {
        Name[] copy = array;
        return copy;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        a = (T[]) new Name[count];
        for (int i = 0; i < count; i++)
            a[i] = (T) array[i];
        return a;
    }

    @Override
    public boolean add(Name o) {
        if (count == range - 1) {
            int oldRange = range;
            range = range + 5;
            Name[] copy = new Name[range];
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
            if (o.equals(array[i])) {
                array[i] = null;
                remove = true;
            }
        }
        return remove;    }


    @Override
    public boolean addAll(Collection c) {
        for (Object item : c)
            add((Name) item);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        for (Object item : c) {
            add(index, (Name) item);
            index++;
        }
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i <= count; i++)
            array[i] = null;
        count = 0;


    }

    @Override
    public Name get(int index) {
        return array[index];
    }

    @Override
    public Name set(int index, Name element) {
        array[index] = element;
        return element;
    }

    @Override
    public void add(int index, Name element) {
        if (count == range - 1) {
            int oldRange = range;
            range = range + 5;
            Name[] copy = new Name[range];
            for (int i = 0; i < oldRange; i++) {
                copy[i] = array[i];
            }
            for (int i = 0; i <= count; i++) {
                if (i >= index) {
                    Name o = copy[i];
                    copy[i] = element;
                    element = o;
                }
            }
            count++;
            array = copy;

        } else {
            for (int i = 0; i <= count; i++) {
                if (i >= index) {
                    Name o = array[i];
                    array[i] = element;
                    element = o;
                }
            }
        }
        count++;
    }

    @Override
    public Name remove(int index) {
        array[index] = null;
        for (int i = index; i < count; i++) {
            int next = i + 1;
                array[i] = array[next];
                array[next] = null;
        }
        count--;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
        for (int i = 0; i <= size(); i++) {
            if (o.equals(array[i])) {
                index = i;
               return index;
            }
        }
        return index;    }

    @Override
    public int lastIndexOf(java.lang.Object o) {
        int index = 0;  
        for (int i = 0; i <= size(); i++) {
            if (array[i] == o) {
                index = i;
            }
        }
        return index;    }


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
        List<Name> subList = new java.util.ArrayList<>();
        for (int i = fromIndex; i <= toIndex; i++) {
            subList.add(array[i]);
        }
        return subList;
    }

    @Override
    public boolean retainAll(Collection c) {
        Name[] copy = new Name[range];
        boolean remove = false;
        for (java.lang.Object e : c) {
            for (int i = 0; i <= size(); i++) {
                if (array[i] == e) {
                    copy[i] = array[i];
                    array = copy;
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
        for (Object item : c) {
            if (contains(item))
                return false;
        }
        return true;
    }


    private static class ArrayListIterator implements Iterator<Name> {
        int nextIndex = 0;
        int index = 0;

        @Override
        public boolean hasNext() {
            if (array[nextIndex] != null) {
                nextIndex++;
                index = nextIndex--;
                return true;
            }
            return false;
        }

        @Override
        public Name next() {
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
        public Name next() {
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
        public Name previous() {
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
        public void set(java.lang.Object o) {
            array[index] = (Name) o;
        }

        @Override
        public void add(java.lang.Object o) {
            for (int i = 0; i <= array.length; i++) {
                if (i >= index) {
                    Name e = array[i];
                    array[i] = (Name) o;
                    o = e;
                }
            }
        }

    }
}
