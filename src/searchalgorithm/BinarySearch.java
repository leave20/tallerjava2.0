package searchalgorithm;

public class BinarySearch {
    /**
     * Iterative example
     */
    public static int binarySearch(int[] arr, int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        // termination condition (element isn't present)
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // if the middle element is our goal element, return its index
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }
            // if the middle element is smaller
            // point our index to the middle+1, taking the first half out of consideration
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // if the middle element is bigger
                // point our index to the middle-1, taking the second half out of consideration
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;
        }
        return -1;
    }
    public static void print(int elementToSearch, int index) {
        if (index == -1)
            System.out.println(elementToSearch + " found at index: " + index);

    }
    public static void main(String[] args) {
        int index = binarySearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
        print(67, index);
    }
}

