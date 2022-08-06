package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ArrayList arrayList = new ArrayList();
    static Name o = new Name("Ivan");
    static Name e = new Name("Pavel");


    public static void main(String[] args) {

        List<Name> objects = new java.util.ArrayList<>();
        objects.add(o);
        objects.add(e);
         while (true) {
            menu(objects);
        }

    }

    public static void menu(List objects) {
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите действие");
        System.out.println("""
                +0-показать
                +1-size()
                +2-isEmpty()
                3-contains(Object o)
                4-iterator()
                5-toArray()
                +6-add(Object o)
                7-remove(Object o)
                +8-addAll(Collection c)
                +9-addAll(int index, Collection c)
                +10-clear()
                +11-get(int index)
                +12-set(int index, Object element)
                +13-add(int index, Object element)
                +14-remove(int index)
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
        if (choice == 0) {
            for (int i = 0; i < arrayList.lenth(); i++)
                System.out.println(arrayList.get(i));
        }
        if (choice == 1) {
            System.out.println(arrayList.size());
        }
        if (choice == 2) {
            System.out.println(arrayList.isEmpty());
        }
        if (choice == 3) {
            String name = input.next();
            Name o = new Name(name);
            System.out.println(arrayList.contains(o));
        }
        if (choice == 4) {
            arrayList.iterator();
        }
        if (choice == 5) {
            System.out.println(Arrays.toString(arrayList.toArray()));
        }
        if (choice == 6) {
            String name = input.next();
            Name o = new Name(name);
            arrayList.add(o);
        }
        if (choice == 7) {
            String name = input.next();
            Name o = new Name(name);
            arrayList.remove(o);
        }
        if (choice == 8) {
            arrayList.addAll(objects);
        }
        if (choice == 9) {
            int index = input.nextInt();
            arrayList.addAll(index, objects);
        }
        if (choice == 10) {
            arrayList.clear();
        }
        if (choice == 11) {
            int index = input.nextInt();
            System.out.println(arrayList.get(index));
        }
        if (choice == 12) {
            int index = input.nextInt();
            String name = input.next();
            Name o = new Name(name);
            arrayList.set(index, o);
        }
        if (choice == 13) {
            int index = input.nextInt();
            String name = input.next();
            Name o = new Name(name);
            arrayList.add(index, o);
        }
        if (choice == 14) {
            int index = input.nextInt();
            arrayList.remove(index);
        }
        if (choice == 15) {
            String name = input.next();
            Name o = new Name(name);
            System.out.println(arrayList.indexOf(o));
        }
        if (choice == 16) {
            String name = input.next();
            Name o = new Name(name);
            System.out.println(arrayList.lastIndexOf(o));
        }
        if (choice == 17) {
            arrayList.listIterator();
        }
        if (choice == 18) {
            arrayList.listIterator();
        }
        if (choice == 19) {
            int from = input.nextInt();
            int to = input.nextInt();
            arrayList.subList(from, to);
        }
        if (choice == 20) {
            arrayList.retainAll(objects);
        }
        if (choice == 21) {
            arrayList.removeAll(objects);
        }
        if (choice == 22) {
            System.out.println(arrayList.containsAll(objects));
        }
        if (choice == 23) {
            System.out.println(Arrays.toString(arrayList.toArray()));
        }
    }

}
