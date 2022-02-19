package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Random random1 = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(random.nextInt(1, 100));
        }
        System.out.println(arrayList + " ");
        System.out.println("------------------------");
        System.out.println(Collections.max(arrayList));
        System.out.println("------------------------");
        System.out.println(Collections.min(arrayList));
        System.out.println("------------------------");
        Collections.sort(arrayList);
        System.out.println(Collections.frequency(arrayList, 5));
        System.out.println("------------------------");
        System.out.println(Collections.frequency(arrayList, 7));
        System.out.println("--------------------------------------------------------");

        ArrayList<Integer> arrayList2 = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            arrayList2.add(random1.nextInt(1, 100));
        }
        ArrayList<Integer> arrayList3 = new ArrayList<>(arrayList2);
        System.out.println(arrayList3);
        Collections.shuffle(arrayList3);
        int count = 0;
        while (true) {
            if (arrayList3.equals(arrayList2)) {
                System.out.println(count);
                break;
            } else {
                count += 1;
                Collections.shuffle(arrayList3);

            }
        }
        System.out.println("--------------------------");
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList4.add(random.nextInt(1, 100));
        }
        System.out.println(arrayList4);
        System.out.println("-------------------");
        ArrayList<Integer> arrayList6 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList6.add(random.nextInt(1, 100));
        }
        Collections.sort(arrayList6);
        ArrayList<Integer> arrayList7 = new ArrayList<>(arrayList6);

        int count1 = 0;
        Collections.shuffle(arrayList6);
        while (true) {
            if (arrayList6.equals(arrayList7)) {
                System.out.println(count1);
                break;
            } else {
                count1 += 1;
                Collections.shuffle(arrayList6);
            }
        }

    }
}
