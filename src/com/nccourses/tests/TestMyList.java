package com.nccourses.tests;

import com.nccourses.mylinkedlist.MyLinkedList;

import java.util.Arrays;

public class TestMyList {
    public static void testMyList(){
        MyLinkedList<Integer> l = new MyLinkedList<>();
        l.add(1);
        l.add(4);
        l.add(3);
        l.add(7);
        System.out.println("add 4 elems: " + l + " " + l.size());
        Object[] arr = l.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr));
        l.clear();
        System.out.println("after clear:" + l + " " + l.size());
        l.add(0, 10);
        l.add(1, 20);
        l.add(1, 15);
        l.add(40);
        l.add(0, -100);
        System.out.println("l.add(0, 10)");
        System.out.println("l.add(1, 20)");
        System.out.println("l.add(1, 15)");
        System.out.println("l.add(40)");
        System.out.println("l.add(0, -100)");
        System.out.println("after adds: " + l + " " + l.size());
        System.out.println("l.get(1): " + l.get(1));
        System.out.println("l.indexOf(20): " + l.indexOf(20));
        l.remove(2);
        System.out.println("remove(2): " + l + " " + l.size());
        l.set(0, -10);
        System.out.println("l.set(0, -10) " + l + " " + l.size());
        l.set(3, 100);
        System.out.println("l.set(3, 100) " + l + " " + l.size());
        l.clear();
        System.out.println("l.clear(): " + l + " " + l.size());
    }
}
