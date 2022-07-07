package com.designpatterns.behavioral.strategy;

public class ArraySorting {

    Sortable sortingAlgo;
    int[] arr;

    public ArraySorting(Sortable sortingAlgo, int[] arr) {
        this.sortingAlgo = sortingAlgo;
        this.arr = arr;
    }

    public int[] sort() {
        return sortingAlgo.doSort(arr);
    }

    public void displayArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
