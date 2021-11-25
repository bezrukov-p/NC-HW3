package com.nccourses;

import com.nccourses.mylinkedlist.ILinkedList;
import com.nccourses.mylinkedlist.MyLinkedList;
import com.nccourses.tests.TestMyList;
import com.nccourses.tests.TestPerformanceLists;
import com.nccourses.tests.TestPerformanceMap;
import com.nccourses.tests.TestPerformanceSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {

        //TestMyList.testMyList();

        //ADD
        //10.000.000
        //TestPerformanceLists.testMyLinkListAdd(10000000);
        //TestPerformanceLists.testJavaLinkListAdd(10000000);
        //TestPerformanceLists.testJavaArrListAdd(10000000);

        //100.000
        //TestPerformanceLists.testMyLinkListAdd(100000);
        //TestPerformanceLists.testJavaLinkListAdd(100000);
        //TestPerformanceLists.testJavaArrListAdd(100000);

        //500
        //TestPerformanceLists.testMyLinkListAdd(500);
        //TestPerformanceLists.testJavaLinkListAdd(500);
        //TestPerformanceLists.testJavaArrListAdd(500);

        //20
        //TestPerformanceLists.testMyLinkListAdd(20);
        //TestPerformanceLists.testJavaLinkListAdd(20);
        //TestPerformanceLists.testJavaArrListAdd(20);

        //TestPerformanceLists.testMyLinkListGet(100000, 20000);
        //TestPerformanceLists.testJavaLinkListGet(100000, 20000);
        //TestPerformanceLists.testJavaArrListGet(100000, 20000);

        //TestPerformanceLists.testMyLinkListAddIndex(100000, 20000);
        //TestPerformanceLists.testJavaLinkListAddIndex(100000, 20000);
        //TestPerformanceLists.testJavaArrListAddIndex(100000, 20000);

        //add INDEX 0
        //TestPerformanceLists.testMyLinkListAddIndex(100000, 1000, 0);
        //TestPerformanceLists.testJavaLinkListAddIndex(100000, 1000, 0);
        //TestPerformanceLists.testJavaArrListAddIndex(100000, 1000, 0);

        //TestPerformanceLists.testMyLinkListAddIndex(1000, 100);
        //TestPerformanceLists.testJavaLinkListAddIndex(1000, 100);
        //TestPerformanceLists.testJavaArrListAddIndex(1000, 100);

        //TestPerformanceLists.testMyLinkListRemove(100000,20000);
        //TestPerformanceLists.testJavaLinkListRemove(100000,20000);
        //TestPerformanceLists.testJavaArrListRemove(100000,20000);

        // INDEX 0
        //TestPerformanceLists.testMyLinkListRemove(100000,20000, 0);
        //TestPerformanceLists.testJavaLinkListRemove(100000,20000, 0);
        //TestPerformanceLists.testJavaArrListRemove(100000,20000, 0);

        //###########################################################################

        //TestPerformanceSets.testHashSetAdd(1000000);
        //TestPerformanceSets.testLinkedHashSetAdd(1000000);
        //TestPerformanceSets.testTreeSetAdd(1000000);

        //TestPerformanceSets.testHashSetRemove(1000000, 10000);
        //TestPerformanceSets.testLinkedHashSetRemove(1000000, 10000);
        //TestPerformanceSets.testTreeSetRemove(1000000, 10000);

        //#########################################################################

        //TestPerformanceMap.testHashMapPut(1000000);
        //TestPerformanceMap.testLinkedHashMapPut(1000000);
        //TestPerformanceMap.testTreeMapPut(1000000);

        //TestPerformanceMap.testHashMapGet(100000, 20000);
        //TestPerformanceMap.testLinkedHashMapGet(100000, 20000);
        //TestPerformanceMap.testTreeMapGet(100000, 20000);

        //TestPerformanceMap.testHashMapRemove(100000, 20000);
        //TestPerformanceMap.testLinkedHashMapRemove(100000, 20000);
        //TestPerformanceMap.testTreeMapRemove(100000, 20000);

    }
}
