package algorithms.sorting;

/**
 * FIXME: Complete the following famous algorithms with their method body implementations
 *        It is suggested that you type them out by memory-ish to see if you understand the
 *        algorithm.
 */
public class IModule {

    //TODO: Complete the following sorting algorithms

    public static void bubbleSort(int[] data) {
        //TODO: Implement the algorithm for this sort.
    	int n = data.length;
    	
    	for (int i = 0; i < n - 1; i++) {
    		for (int j = 0; j < n - i - 1; j++) {
    			if (data[j] > data[j + 1]) {
    				swap(data, j, j + 1);
    			}
    		}
    	}
    }


    public static void insertionSort(int[] data) {
        //TODO: Implement the algorithm for this sort.
    	int n = data.length;
    	
    	for (int i = 1; i < n; i++) {
    		int key = data[i];
    		int j = i - 1;
    		
    		while (j >= 0 && data[j] > key) {
    			data[j + 1] = data[j];
    			j--;
    		}
    		data [j + 1] = key;
    	}
    }


  //TODO: Update/Complete the following selectionSort algorithm
    //      using for loops and swap method (see below)
    public static void selectionSort(int[] data) {
        //TODO: Complete Body
    	int n = data.length;
    	for (int i = 0; i < n - 1; i++) {
    		int minIndex = i;
    		
    		for (int j = i + 1; j < n; j++) {
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
