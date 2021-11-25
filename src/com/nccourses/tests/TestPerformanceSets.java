package com.nccourses.tests;

import java.util.*;

public class TestPerformanceSets {


    public static void testHashSetAdd(int count){
        Double[] nums = new Double[count];
        for(int i = 0; i < count; i++){
            nums[i] = Math.random();
        }

        long start;
        long finish;
        HashSet<Double> hashSet= new HashSet<>();
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            hashSet.add(nums[i]);
        }
        finish = System.nanoTime();
        System.out.println("time hashSet add " +count+ " elements: " + (finish - start));
    }

    public static void testLinkedHashSetAdd(int count){
        Double[] nums = new Double[count];
        for(int i = 0; i < count; i++){
            nums[i] = Math.random();
        }

        long start;
        long finish;
        LinkedHashSet<Double> linkedHashSet= new LinkedHashSet<>();
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            linkedHashSet.add(nums[i]);
        }
        finish = System.nanoTime();
        System.out.println("time linkedHashSet add " +count+ " elements: " + (finish - start));
    }

    public static void testTreeSetAdd(int count){
        Double[] nums = new Double[count];
        for(int i = 0; i < count; i++){
            nums[i] = Math.random();
        }

        long start;
        long finish;
        TreeSet<Double> treeSet= new TreeSet<>();
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            treeSet.add(nums[i]);
        }
        finish = System.nanoTime();
        System.out.println("time treeSet add " +count+ " elements: " + (finish - start));
    }


    public static void testHashSetRemove(int size, int count){
        Double[] nums = new Double[size];
        for(int i = 0; i < size; i++){
            nums[i] = Math.random();
        }
        HashSet<Double> hashSet= new HashSet<>();
        for(int i = 0; i < size; i++){
            hashSet.add(nums[i]);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            hashSet.remove(nums[(int)(Math.random() * count)]);
        }
        finish = System.nanoTime();

        System.out.println("time hashSet with size: " + size + " delete " +count+ " elements: " + (finish - start));
    }

    public static void testLinkedHashSetRemove(int size, int count){
        Double[] nums = new Double[size];
        for(int i = 0; i < size; i++){
            nums[i] = Math.random();
        }
        LinkedHashSet<Double> linkedHashSet= new LinkedHashSet<>();
        for(int i = 0; i < size; i++){
            linkedHashSet.add(nums[i]);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            linkedHashSet.remove(nums[(int)(Math.random() * count)]);
        }
        finish = System.nanoTime();

        System.out.println("time linkedHashSet with size: " + size + " delete " +count+ " elements: " + (finish - start));
    }

    public static void testTreeSetRemove(int size, int count){
        Double[] nums = new Double[size];
        for(int i = 0; i < size; i++){
            nums[i] = Math.random();
        }
        TreeSet<Double> treeSet= new TreeSet<>();
        for(int i = 0; i < size; i++){
            treeSet.add(nums[i]);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            treeSet.remove(nums[(int)(Math.random() * count)]);
        }
        finish = System.nanoTime();

        System.out.println("time treeSet with size: " + size + " delete " +count+ " elements: " + (finish - start));
    }


}
