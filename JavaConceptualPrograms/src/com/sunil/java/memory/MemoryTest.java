package com.sunil.java.memory;

import java.util.ArrayList;
//run this in command line java -Xmx128M MemoryTest
//java -Xmx256	M MemoryTest
public class MemoryTest {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> array =
            new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<10000; i++) {
            try {
                array.add(new ArrayList<Integer>(1000000));
            } catch (OutOfMemoryError e) {
                System.out.println(i);
                break;
            }
        }
    }
}