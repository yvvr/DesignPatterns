package com.designpatterns.behavioral.strategy;

public class BubbleSort implements Sortable {

    @Override
    public int[] doSort(int[] arr) {
        for (int j = arr.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    Helper.swap(arr, i, i + 1);
                }
            }
        }
        return arr;
    }
}
