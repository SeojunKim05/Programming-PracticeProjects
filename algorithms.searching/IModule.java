package algorithms.searching;

/**
 * FIXME: Complete the following famous algorithms with their method body implementations
 *        It is suggested that you type them out by memory-ish to see if you understand the
 *        algorithm.
 */

public class IModule {

    //TODO: Complete this search algorithm to find an element location is in array
    //      use while loops here
    public static int binarySearch(int[] data, int target){
        //TODO: update with search algorithm
    	int leftIndex = 0;
    	int rightIndex = data.length - 1;
    	while (leftIndex <= rightIndex) {
    		int mid = leftIndex + (rightIndex - leftIndex) / 2;
    		
    		if (data[mid] == target) {
    			return mid;
    		} else if (data[mid] < target) {
    			leftIndex = mid + 1;
    		} else {
    			rightIndex = mid - 1;
    		}
    	}
        return -1;
    }


    //TODO: Complete this search algorithm to check if an element is in array
    public static boolean contains(int[] data, int target) {
        //TODO: update with search algorithm
    	for (int value : data) {
    		if (value == target) {
    			return true;
    		}
    	}
        return false;
    }
  //TODO: Complete this search algorithm to find an element location is in array
    //      use for loops here
    public static int indexOf(int[] data, int target) {
        //TODO: update with search algorithm
    	for (int i  = 0; i < data.length; i++) {
    		if (data[i] == target) {
    		return i;
    		}
    	}
        return -1;
    }


    // This is an example of "finding the worst case run time function"
    // for a maximum value algorithm
    public static int max(int[] data){
        int n   = data.length;          // (1)      data size
        int max = data[0];              // (1)

        //       (1)
        for(int i = 0; i < n; i++)     // n times
            // (1  + 1)
            if(max < data[i])               // (1)
                max = data[i];              // (1)
        // (1)      terminates loop
        return max;                     // (1)

        // run time function f(n) = 1 + 1 + 1 + n(2 + 1 + 1)
        //                   f(n) = 4n + 5
    }


}
