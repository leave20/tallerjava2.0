package searchalgorithm;

import java.util.stream.IntStream;

public class LinearSearch {

    public static int linearSearch(int[] arr, int elementToSearch){

//        for (int index=0; index <arr.length; index ++){
//            if (arr[index]==elementToSearch)
//                return index;
//        }
        return IntStream.range(0, arr.length).filter(index -> arr[index] == elementToSearch).findFirst().orElse(-1);

    }

    public static void print(int elementToSearch, int index) {
        if (index == -1){
            System.out.println(elementToSearch + " not found.");
        }
        else {
            System.out.println(elementToSearch + " found at index: " + index);
        }
    }

    public static void main(String[] args) {
        int index = linearSearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
        print(67, index);
    }
}
