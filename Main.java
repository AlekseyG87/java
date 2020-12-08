package ASD_Les2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        MyArrayList<Integer> arl = new MyArrayList<>(1000000);
        for (int i = 0; i < 100000; i++) {
            arl.add(random.nextInt(1000));
        }
        //System.out.println(arl);
        timeSelSort(arl);
        timeInsSort(arl);
        timeBubSort(arl);
    }

    public static void timeSelSort (MyArrayList<Integer>list ) {
        double startTime = System.currentTimeMillis();
        list.selectionSort();
        double endTime = System.currentTimeMillis();
        double time = (endTime - startTime)/1000;
        System.out.println("Time selection sort = " + time + " sec");
    }

    public static void timeInsSort (MyArrayList<Integer>list ) {
        double startTime = System.currentTimeMillis();
        list.insertionSort();
        double endTime = System.currentTimeMillis();
        double time = (endTime - startTime)/1000;
        System.out.println("Time insertion sort = " + time + " sec");
    }

    public static void timeBubSort (MyArrayList<Integer>list ) {
        double startTime = System.currentTimeMillis();
        list.bubbleSort();
        double endTime = System.currentTimeMillis();
        double time = (endTime - startTime)/1000;
        System.out.println("Time bubble sort = " + time + " sec");
    }



}
