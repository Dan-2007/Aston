package org.example.task5.strategy;

/**
 * Context using sort strategy.
 */
public class SorterContext {
    private SortStrategy strategy;

    public SorterContext(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array) {
        strategy.sort(array);
    }
}