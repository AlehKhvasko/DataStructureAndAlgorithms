package com.khvasko.quicksort;

public class QuickSort {
    private static void swap(int[] array, Integer firstIndex, Integer secondInteger) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondInteger];
        array[secondInteger] = temp;
    }

    public static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    public static void quickSortHelper(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, right);
        }
    }

    public static void quickSort(int[] array){
        quickSortHelper(array, 0, array.length - 1);
    }
}
