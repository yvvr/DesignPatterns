package com.designpatterns;

import com.designpatterns.behavioral.strategy.ArraySorting;
import com.designpatterns.behavioral.strategy.BubbleSort;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArraySorting arraySorting = new ArraySorting(new BubbleSort(), new int[]{9, 6, 2, 7, 1});
        arraySorting.sort();
        arraySorting.displayArray();
    }
}
