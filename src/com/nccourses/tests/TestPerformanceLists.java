package com.nccourses.tests;

import com.nccourses.mylinkedlist.MyLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestPerformanceLists {
    public static void testJavaLinkListAdd(int count){
        LinkedList<Integer> javaList = new LinkedList<>();

        long start;
        long finish;

        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            javaList.add(i);
        }
        finish = System.nanoTime();
        System.out.println("time javaList add " +count+ " elements: " + (finish - start));

    }

    public static void testMyLinkListAdd(int count){
        MyLinkedList<Integer> myList = new MyLinkedList<>();

        long start;
        long finish;

        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            myList.add(i);
        }
        finish = System.nanoTime();
        System.out.println("time myList add " +count+ " elements: " + (finish - start));
    }

    public static void testJavaArrListAdd(int count) {
        ArrayList<Integer> javaArr = new ArrayList<>();
        long start;
        long finish;

        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            javaArr.add(i);
        }
        finish = System.nanoTime();

        System.out.println("time javaArrList add " + count + " elements: " + (finish - start));
    }

    public static void testJavaLinkListGet(int size, int count){
        LinkedList<Integer> javaList = new LinkedList<>();
        for(int i = 0; i < size; i++){
            javaList.add(i);
        }


        long start;
        long finish;
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            javaList.get((int)(Math.random() * count));
        }
        finish = System.nanoTime();
        System.out.println("time javaList get(index), size " +
                size + ", countget: " + count + ": " + (finish - start));
    }

    public static void testMyLinkListGet(int size, int count){
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        for(int i = 0; i < size; i++){
            myList.add(i);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            myList.get((int)(Math.random() * count));
        }
        finish = System.nanoTime();
        System.out.println("time myList get(index), size " +
                size + ", countget: " + count + ": " + (finish - start));
    }

    public static void testJavaArrListGet(int size, int count){
        ArrayList<Integer> javaArr = new ArrayList<>();
        for(int i = 0; i < size; i++){
            javaArr.add(i);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            javaArr.get((int)(Math.random() * count));
        }
        finish = System.nanoTime();

        System.out.println("time javaArrList get(index), size " +
                size + ", countget: " + count + ": " + (finish - start));
    }

    public static void testMyLinkListAddIndex(int size, int count){
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        for(int i = 0; i < size; i++){
            myList.add(i);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            myList.add((int)(Math.random() * (myList.size() + 1)), -1);
        }
        finish = System.nanoTime();
        System.out.println("time MyLinkList indexadd(index), size: " +
                size + ", countadd: " + count + " : " + (finish - start));
    }

    public static void testJavaLinkListAddIndex(int size, int count){
        LinkedList<Integer> javaLinkList = new LinkedList<>();
        for(int i = 0; i < size; i++){
            javaLinkList.add(i);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            javaLinkList.add((int)(Math.random() * (javaLinkList.size() + 1)), -1);
        }
        finish = System.nanoTime();
        System.out.println("time javaLinkList indexadd(index), size: " +
                size + ", countadd: " + count + " : " + (finish - start));
    }

    public static void testJavaArrListAddIndex(int size, int count){
        ArrayList<Integer> javaArrList = new ArrayList<>();
        for(int i = 0; i < size; i++){
            javaArrList.add(i);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            javaArrList.add((int)(Math.random() * (javaArrList.size() + 1)), -1);
        }
        finish = System.nanoTime();
        System.out.println("time javaArrList indexadd(index), size: " +
                size + ", countadd: " + count + " : " + (finish - start));
    }

    public static void testMyLinkListRemove(int size, int count){
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        for(int i = 0; i < size; i++){
            myList.add(i);
        }
        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            myList.remove((int)(Math.random() * myList.size()));
        }
        finish = System.nanoTime();
        System.out.println("time myLinkList remove(index), size: " +
                size + ", countremove: " + count + " : " + (finish - start));
    }

    public static void testJavaLinkListRemove(int size, int count){
        LinkedList<Integer> javaLink = new LinkedList<>();
        for(int i = 0; i < size; i++){
            javaLink.add(i);
        }
        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            javaLink.remove((int)(Math.random() * javaLink.size()));
        }
        finish = System.nanoTime();
        System.out.println("time javaLinkList remove(index), size: " +
                size + ", countremove: " + count + " : " + (finish - start));
    }

    public static void testJavaArrListRemove(int size, int count){
        ArrayList<Integer> javaArrList = new ArrayList<>();
        for(int i = 0; i < size; i++){
            javaArrList.add(i);
        }
        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            javaArrList.remove((int)(Math.random() * javaArrList.size()));
        }
        finish = System.nanoTime();
        System.out.println("time javaArrList remove(index), size: " +
                size + ", countremove: " + count + " : " + (finish - start));
    }


    public static void testMyLinkListAddIndex(int size, int count, int index){
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        for(int i = 0; i < size; i++){
            myList.add(i);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            myList.add(index, -1);
        }
        finish = System.nanoTime();
        System.out.println("time MyLinkList indexadd(0), size: " +
                size + ", countadd: " + count + " : " + (finish - start));
    }

    public static void testJavaLinkListAddIndex(int size, int count, int index){
        LinkedList<Integer> javaLinkList = new LinkedList<>();
        for(int i = 0; i < size; i++){
            javaLinkList.add(i);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            javaLinkList.add(index, -1);
        }
        finish = System.nanoTime();
        System.out.println("time javaLinkList indexadd(0), size: " +
                size + ", countadd: " + count + " : " + (finish - start));
    }

    public static void testJavaArrListAddIndex(int size, int count, int index){
        ArrayList<Integer> javaArrList = new ArrayList<>();
        for(int i = 0; i < size; i++){
            javaArrList.add(i);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            javaArrList.add(index, -1);
        }
        finish = System.nanoTime();
        System.out.println("time javaArrList indexadd(0), size: " +
                size + ", countadd: " + count + " : " + (finish - start));
    }


    public static void testMyLinkListRemove(int size, int count, int index){
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        for(int i = 0; i < size; i++){
            myList.add(i);
        }
        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            myList.remove(index);
        }
        finish = System.nanoTime();
        System.out.println("time myLinkList remove(0), size: " +
                size + ", countremove: " + count + " : " + (finish - start));
    }

    public static void testJavaLinkListRemove(int size, int count, int index){
        LinkedList<Integer> javaLink = new LinkedList<>();
        for(int i = 0; i < size; i++){
            javaLink.add(i);
        }
        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            javaLink.remove(index);
        }
        finish = System.nanoTime();
        System.out.println("time javaLinkList remove(0), size: " +
                size + ", countremove: " + count + " : " + (finish - start));
    }

    public static void testJavaArrListRemove(int size, int count, int index){
        ArrayList<Integer> javaArrList = new ArrayList<>();
        for(int i = 0; i < size; i++){
            javaArrList.add(i);
        }
        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            javaArrList.remove(index);
        }
        finish = System.nanoTime();
        System.out.println("time javaArrList remove(0), size: " +
                size + ", countremove: " + count + " : " + (finish - start));
    }


    public static void testMyLinkListRemoveWithIter(int size){
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        for(int i = 0; i < size; i++){
            myList.add((int)(Math.random() * 5));
        }

        Iterator<Integer> itr = myList.iterator();
        Integer value = 0;

        long start;
        long finish;
        start = System.nanoTime();
        while(itr.hasNext()){
            if (value.equals(itr.next()))
                itr.remove();
        }
        finish = System.nanoTime();

        System.out.println("LinkList remove with iter, size = " + size + ", time: " + (finish - start));
    }

    public static void testJavaLinkListRemoveWithIter(int size){
        LinkedList<Integer> javaList = new LinkedList<>();
        for(int i = 0; i < size; i++){
            javaList.add((int)(Math.random() * 5));
        }

        Iterator<Integer> itr = javaList.listIterator();
        Integer value = 0;

        long start;
        long finish;
        start = System.nanoTime();
        while(itr.hasNext()){
            if (value.equals(itr.next()))
                itr.remove();
        }
        finish = System.nanoTime();

        System.out.println("LinkList remove with iter, size = " + size + ", time: " + (finish - start));
    }

    public static void testJavaArrListRemoveWithIter(int size){
        ArrayList<Integer> javaArr = new ArrayList<>();
        for(int i = 0; i < size; i++){
            javaArr.add((int)(Math.random() * 5));
        }

        Iterator<Integer> itr = javaArr.listIterator();
        Integer value = 0;

        long start;
        long finish;
        start = System.nanoTime();
        while(itr.hasNext()){
            if (value.equals(itr.next()))
                itr.remove();
        }
        finish = System.nanoTime();

        System.out.println("ArrList remove with iter, size = " + size + ", time: " + (finish - start));
    }

}
