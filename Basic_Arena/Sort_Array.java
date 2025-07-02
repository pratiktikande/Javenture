package Basic_Arena;

import java.util.Arrays;
public class Sort_Array {

    public static void main(String[] args) {
        int arr[] = { 1, 5, 82, 63, 74, 12, 06 };
        System.out.println("Array Before sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Arrays After Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }     
    }
}