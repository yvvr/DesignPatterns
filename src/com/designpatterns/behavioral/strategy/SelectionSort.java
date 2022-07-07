package com.designpatterns.behavioral.strategy;

public class SelectionSort implements Sortable {

    @Override
    public int[] doSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    Helper.swap(arr, i, j);
                }
            }
        }
        return arr;
    }
}
