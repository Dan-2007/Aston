package org.example.task5.strategy;

import java.util.Arrays;

/**
 * The example of strategy pattern.
 */
public class Client {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};

        SorterContext context = new SorterContext(new BubbleSortStrategy());
        context.sortArray(array);
        System.out.println("Bubble sorted: " + Arrays.toString(array));

        int[] array2 = {9, 7, 6, 3, 1};
        context.setStrategy(new QuickSortStrategy());
        context.sortArray(array2);
        System.out.println("Quick sorted: " + Arrays.toString(array2));
    }
}