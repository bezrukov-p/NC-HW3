package com.nccourses.tests;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TestPerformanceMap {


    public static void testHashMapPut(int count){
        Double[] nums = new Double[count];
        for(int i = 0; i < count; i++){
            nums[i] = Math.random();
        }

        long start;
        long finish;
        HashMap<Double, Double> hashMap = new HashMap<>();
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            hashMap.put(nums[i], nums[i]);
        }
        finish = System.nanoTime();
        System.out.println("time hashMap add " +count+ " elements: " + (finish - start));
    }

    public static void testLinkedHashMapPut(int count){
        Double[] nums = new Double[count];
        for(int i = 0; i < count; i++){
            nums[i] = Math.random();
        }

        long start;
        long finish;
        LinkedHashMap<Double, Double> linkedHashMap = new LinkedHashMap<>();
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            linkedHashMap.put(nums[i], nums[i]);
        }
        finish = System.nanoTime();
        System.out.println("time linkedHashMap add " +count+ " elements: " + (finish - start));
    }

    public static void testTreeMapPut(int count){
        Double[] nums = new Double[count];
        for(int i = 0; i < count; i++){
            nums[i] = Math.random();
        }

        long start;
        long finish;
        TreeMap<Double, Double> treeMap = new TreeMap<>();
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            treeMap.put(nums[i], nums[i]);
        }
        finish = System.nanoTime();
        System.out.println("time treeMap add " +count+ " elements: " + (finish - start));
    }


    public static void testHashMapRemove(int size, int count){
        Double[] nums = new Double[size];
        for(int i = 0; i < size; i++){
            nums[i] = Math.random();
        }
        HashMap<Double, Double> hashMap= new HashMap<>();
        for(int i = 0; i < size; i++){
            hashMap.put(nums[i], nums[i]);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            hashMap.remove(nums[(int)(Math.random() * count)]);
        }
        finish = System.nanoTime();

        System.out.println("time hashMap with size: " + size + " delete " +count+ " elements: " + (finish - start));
    }

    public static void testLinkedHashMapRemove(int size, int count){
        Double[] nums = new Double[size];
        for(int i = 0; i < size; i++){
            nums[i] = Math.random();
        }
        LinkedHashMap<Double, Double> linkedHashMap= new LinkedHashMap<>();
        for(int i = 0; i < size; i++){
            linkedHashMap.put(nums[i], nums[i]);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            linkedHashMap.remove(nums[(int)(Math.random() * count)]);
        }
        finish = System.nanoTime();

        System.out.println("time linkedHashMap with size: " + size + " delete " +count+ " elements: " + (finish - start));
    }

    public static void testTreeMapRemove(int size, int count){
        Double[] nums = new Double[size];
        for(int i = 0; i < size; i++){
            nums[i] = Math.random();
        }
        TreeMap<Double, Double> treeMap= new TreeMap<>();
        for(int i = 0; i < size; i++){
            treeMap.put(nums[i], nums[i]);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            treeMap.remove(nums[(int)(Math.random() * count)]);
        }
        finish = System.nanoTime();

        System.out.println("time treeMap with size: " + size + " delete " +count+ " elements: " + (finish - start));
    }


    public static void testHashMapGet(int size, int count){
        Double[] nums = new Double[size];
        for(int i = 0; i < size; i++){
            nums[i] = Math.random();
        }
        HashMap<Double, Double> hashMap= new HashMap<>();
        for(int i = 0; i < size; i++){
            hashMap.put(nums[i], nums[i]);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            hashMap.get(nums[(int)(Math.random() * count)]);
        }
        finish = System.nanoTime();

        System.out.println("time hashMap with size: " + size + " get " +count+ " elements: " + (finish - start));
    }

    public static void testLinkedHashMapGet(int size, int count){
        Double[] nums = new Double[size];
        for(int i = 0; i < size; i++){
            nums[i] = Math.random();
        }
        LinkedHashMap<Double, Double> linkedHashMap= new LinkedHashMap<>();
        for(int i = 0; i < size; i++){
            linkedHashMap.put(nums[i], nums[i]);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            linkedHashMap.get(nums[(int)(Math.random() * count)]);
        }
        finish = System.nanoTime();

        System.out.println("time linkedHashMap with size: " + size + " get " +count+ " elements: " + (finish - start));
    }

    public static void testTreeMapGet(int size, int count){
        Double[] nums = new Double[size];
        for(int i = 0; i < size; i++){
            nums[i] = Math.random();
        }
        TreeMap<Double, Double> treeMap= new TreeMap<>();
        for(int i = 0; i < size; i++){
            treeMap.put(nums[i], nums[i]);
        }

        long start;
        long finish;
        start = System.nanoTime();
        for(int i = 0; i < count; i++){
            treeMap.get(nums[(int)(Math.random() * count)]);
        }
        finish = System.nanoTime();

        System.out.println("time treeMap with size: " + size + " get " +count+ " elements: " + (finish - start));
    }


}
