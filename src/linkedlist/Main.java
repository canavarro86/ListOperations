//**********************************************
//* Дан массив целых чисел длинной n и число k *
//* Нужно вывести все подмассивы длиной k      *
//* входящих в исходный массив                 *
//**********************************************

package linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<>(Arrays.asList(1.18, 2.63, 3.02, 4.06, 5.63,
                6.71, 7.13, 8.26, 9.71, 0.82));
        int k = 5;

        //printSubarray(array, k);
        printMiddle(array, k);

    }

    private static void printMiddle(ArrayList<Double> array, int k) {
        LinkedList<Double> subList = new LinkedList<>();
        double middle = 0.0;
        int counter = 0;

        for (int i = 0; i < k; i++){
            subList.add(array.get(i));
            middle += array.get(i);
            counter++;
        }

        System.out.print("SubArray: " + subList + " average value: ");

        String str = String.format("%.2f", middle/counter);
        System.out.println(str);

        middle = 0.0;
        counter = 0;

        for (int i = k; i < array.size(); i++){
            subList.add(array.get(i));
            subList.remove();
            System.out.print("SubArray: " + subList + " average value: ");

            for (int j = 0; j < subList.size(); j++){
                middle += subList.get(j);
                counter++;
            }
            str = String.format("%.2f", middle/counter);
            System.out.println(str);
            middle = 0.0;
            counter = 0;
        }


    }



    private static void printSubarray(ArrayList<Double> array, int k) {
        LinkedList<Double> subList = new LinkedList<>();

        for (int i = 0; i < k; i++){
            subList.add(array.get(i));
        }

        System.out.println(subList);

        for (int i = k; i < array.size(); i++){
            subList.add(array.get(i));
            subList.remove();
            System.out.println(subList);
        }
    }
}