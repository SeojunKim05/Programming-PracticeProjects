package algorithms.sorting;

/**
 * FIXME: Complete the following famous algorithms with their method body implementations
 *        It is suggested that you type them out by memory-ish to see if you understand the
 *        algorithm.
 */

public class RModule {

    //TODO: Complete the following helper methods for the corresponding
    //      sorting algorithm
    private static int[] getFirstHalf(int[] data) {
        //TODO : update to get first half of array
        int size = data.length / 2;
        int[] firstHalf = new int[size];
        for (int i = 0; i < size; i++) {
        	firstHalf[i] = data[i];
        }
        return firstHalf;
    }

    private static int[] getSecondHalf(int[] data) {
    	int size = data.length - data.length / 2;
        int[] secondHalf = new int[size];
        for (int i = 0; i < size; i++) {
        	secondHalf[i] = data[data.length / 2 + i];
        }
        return secondHalf;
    }



    //TODO: Complete the following helper method for the corresponding
    //      sorting algorithm
    private static void merge(int[] data, int[] left, int[] right) {
        //TODO: complete algorithm implementation
    	int leftIndex = 0;
    	int rightIndex = 0;
    	int dataIndex = 0;
    	
    	while (leftIndex <  left.length && rightIndex < right.length) {
    		if (left[leftIndex] < right[rightIndex]) {
    			data[dataIndex++] = left[leftIndex++];
    		} else {
    			data[dataIndex++] = right[rightIndex++];
    		}
    	}
    	while (leftIndex < left.length) {
    		data[dataIndex++] = left[leftIndex++];
    		
    	}
    	while (rightIndex < right.length) {
    		data[dataIndex++] = right[rightIndex++];
    	}
    }

    //TODO: Complete the following sorting algorithm
    public static void mergeSort(int[] data) {
        //TODO: complete algorithm implementation
    	if (data.length > 1) {
    		int[] firstHalf = getFirstHalf(data);
    		int [] secondHalf = getSecondHalf(data);
    		mergeSort(firstHalf);
    		mergeSort(secondHalf);
    		merge(data, firstHalf, secondHalf);
    	}
    }



    //TODO: Complete the following helper method for the corresponding
    //      sorting algorithm
    private static int partition(int[] data, int low, int high) {
        //TODO: update with partition algorithm
    	int pivot = data[high];
    	int i = low - 1;
    	for (int j = low; j < high; j++)
    		if (data[j] <= pivot) {
    			i++;
    			swap(data, i, j);
    		}
    	swap(data, i + 1, high);
        return i + 1;
    }

    //TODO: Complete the following sorting algorithm
    public static void quickSort(int[] data) {
        //TODO : update to call helper method
    	quickSort(data, 0, data.length - 1);

    }

    private static void quickSort(int[] data, int min, int max) {
        //TODO: update to partition list
    	if (min < max) {
    		int pivotIndex = partition(data, min, max);
    		quickSort(data, min, pivotIndex - 1);
    		quickSort(data, pivotIndex + 1, max);
    	}
    }


    //TODO: Complete the following sorting algorithm
    public static void selectionSort(int[] data) {
        //TODO: Update method body
    	selectionSort(data,0);
    }

    private static void selectionSort(int[] data, int start) {
        //TODO: Update method body
    	for (int i = start; i < data.length - 1; i++) {
    		int minIndex = i;
    		for (int j = i + 1; j < data.length; j++) {
    			if (data[j] < data[minIndex]) {
    				minIndex = j;
    			}
    		}
    		if (minIndex != 1) {
    			swap(data, i, minIndex);
    		}
    	}
    }


    //TODO: Complete and use the following swap method for
    //      sorting algorithm that require swapping of data
    public static void swap(int[] data, int a, int b) {
        //TODO: Update method body
    	int temp = data[a];
    	data[a] = data[b];
    	data[b] = temp;
    }
}
