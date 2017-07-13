package com.adile;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class StudentNote {
    public static void main(String[] args) {
        int[] b = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        //System.out.println(averageNote(b));
        for (int val : averageNote(b)) {
            System.out.println("Ortalamanin ustundeki notlar :" + val);// for each kullanıp yeni fonksiyondaki tüm değerleri aldık.

            //deneme
        }
    }

    public static List<Integer> averageNote(int[] a) {
        int sumOfNote = 0;
        int average;
        List<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            sumOfNote = sumOfNote + a[i];
        }
        average = sumOfNote / a.length;
        System.out.println(average);
        for (int i = 0; i < a.length; i++) {
            if (a[i] > average) {
                c.add(a[i]);
            }
        }

        return c;
    }

}
