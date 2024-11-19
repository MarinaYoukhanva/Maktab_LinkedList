package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();

        System.out.println("'remove last' test: ");
        list1.addAsFirst(1);
        list1.addAsFirst(2);
        list1.addAsFirst(3);
        list1.show();
        try {
            list1.removeLast();
            list1.removeLast();
            list1.removeLast();
            list1.removeLast();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());;
        }
        list1.show();

        System.out.println("'remove(index)' test: ");
        list2.addAsLast(1);
        list2.addAsLast(2);
        list2.addAsLast(3);
        list2.addAsLast(4);
        list2.addAsLast(5);
        list2.show();
        list2.remove(2);
        list2.show();

        System.out.println("'find' test: ");
        try {
            System.out.println(list2.find(7));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("list3 test: ");
        try {
            list3.removeFirst();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());;
        }
        list3.show();

        list3.addAsFirst(1);
        list3.addAsLast(2);
        list3.addAsLast(3);
        list3.addAsFirst(4);
        list3.addAsFirst(5);
        list3.addAsLast(6);
        list3.show();
        list3.removeLast();
        list3.show();
        list3.removeFirst();
        list3.show();
        list3.removeFirst();
        list3.show();
        list3.addAsFirst(11);
        list3.addAsLast(12);
        list3.show();

//        System.out.println(list2.isEmpty());
//        System.out.println(list1.isEmpty());
//
//        System.out.println(list2.contains(1));
//        System.out.println(list2.contains(20));

    }
}