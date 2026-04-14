public class BinarySearch {

    public static void main(String[] args) {
        int[] data = {2, 5, 8, 12, 16, 23, 38}; // Must be sorted
        int target = 23;
        int result = search(data, target);
        
        System.out.println(result != -1 ? "Element found at index: " + result : "Element not found");
    }
    
    /**
    * Returns the index of target if found, else returns -1
    */
    public static int search(int[] arr, int target) {
        int left = 0; //start at furthest left index, in order to include all the values
        int right = arr.length - 1; //to include all values, set right bound to furthest right value

        while (left <= right) {
            // Use this formula to prevent potential integer overflow
            int mid = (left + ((right-left)/2));

            if (target == mid) { //TODO replace with appropriate condition
                return mid; // Target found
            } else if (target> mid) { //TODO replace with appropriate condition
                // Search the right half
                left = mid; //TODO assign to appropriate, dynamic value
            } else {
                right = mid; //TODO assign to appropriate, dynamic value
            }
        }
        // Target not found 
        return -1; //TODO assign to appropriate value
    }
}