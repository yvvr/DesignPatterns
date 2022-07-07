package com.designpatterns.behavioral.strategy;

public class InsertionSort implements Sortable {

    @Override
    public int[] doSort(int[] arr) {

        for (int i = 0; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        return arr;
    }
}
