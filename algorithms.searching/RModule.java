package algorithms.searching;

/**
 * FIXME: Complete the following famous algorithms with their method body implementations
 *        It is suggested that you type them out by memory-ish to see if you understand the
 *        algorithm.
 */

public class RModule {

    public static int binarySearch(int[] data, int target) {
        return binarySearch(data, target, 0, data.length - 1);
    }

    private static int binarySearch(int[] data, int target, int min, int max) {
        if (min > max) {
        	return -1;
        }
        int mid = min + (max - min) / 2;
        
        if (data[mid] == target) {
        	return mid;
        } else if (data[mid] < target) {
        	return binarySearch(data, target, mid + 1, max);
        }else {
        	return binarySearch(data, target, min, mid - 1);
        }
    }

    //TODO: Update/Complete the following selectionSort algorithm
    //      using for loops and swap method (see below)
    public static void selectionSort(int[] data) {
        //TODO: Complete Body
    	for (int i = 0; i < data.length - 1; i++) {
    		int minIndex = i;
    		
    		for (int j = i + 1; j < data.length; j++) {
    			if (data[j] < data[minIndex]) {
    				minIndex = j;
    			}
    		}
    		if (minIndex != i) {
    			swap(data, i , minIndex);
    		}
    	}
    }


    //TODO: Update/Complete the following swap method
    public static void swap(int[] data, int a, int b) {
        //TODO: Complete Body
    	int temp = data[a];
    	data[a] = data[b];
    	data[b] = temp;
    }
}
