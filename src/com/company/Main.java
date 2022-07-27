package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        Scanner input = new Scanner(System.in);
        System.out.println("Выберите действие");
        System.out.println("""
                1-size()
                2-isEmpty()
                3-contains(Object o)
                4-iterator()
                5-toArray()
                6-add(Object o)
                7-remove(Object o)
                8-addAll(Collection c)
                9-addAll(int index, Collection c)
                10-clear()
                11-get(int index)
                12-set(int index, Object element)
                13-add(int index, Object element)
                14-remove(int index)
                15-indexOf(Object o)
                16-lastIndexOf(Object o)
                17-listIterator()
                18-listIterator(int index)
                19-subList(int fromIndex, int toIndex)
                20-retainAll(Collection c)
                21-removeAll(Collection c)
                22-containsAll(Collection c)
                23-toArray(Object[] a)
                """);
        int choice = input.nextInt();
        if (choice == 1) {
            arrayList.size();
        }
        if (choice == 2) {
            arrayList.isEmpty();
        }
        if (choice == 3) {
            Object o = new Object();
            arrayList.contains(o);
        }
        if (choice == 4) {
            arrayList.iterator();
        }
        if (choice == 5) {
            arrayList.toArray();
        }
        if (choice == 6) {

            arrayList.add();
        }
        if (choice == 7) {
            arrayList
        }
        if (choice == 8) {
            arrayList
        }
        if (choice == 9) {
            arrayList
        }
        if (choice == 10) {
            arrayList
        }
        if (choice == 11) {
            arrayList
        }
        if (choice == 12) {
            arrayList
        }
        if (choice == 13) {
            arrayList
        }
        if (choice == 14) {
            arrayList
        }
        if (choice == 15) {
            arrayList
        }
        if (choice == 16) {
            arrayList
        }
        if (choice == 17) {
            arrayList
        }
        if (choice == 18) {
            arrayList
        }
        if (choice == 19) {
            arrayList
        }
        if (choice == 20) {
            arrayList
        }
        if (choice == 21) {
            arrayList
        }
        if (choice == 22) {
            arrayList
        }
        if (choice == 23) {
            arrayList
        }

    }
}
