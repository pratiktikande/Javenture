package Basic_Arena;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={ 10,89,14,78,63,45};
        System.out.println("Printing unsorted Array");
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);
        System.out.println("");
        System.out.println(" Sorted Array");
         for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
        System.out.println( "Key found at index "+ Arrays.binarySearch(arr, 45));
    }
}