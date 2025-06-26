package Basic_Arena;

import java.util.Arrays;

public class Largest_Smallest_In_array {
    public static void main(String[] args) {
        int arr[]={2,45,13,79,95,63,72,38};
        int length = arr.length;
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[length-1]);
    }
}
