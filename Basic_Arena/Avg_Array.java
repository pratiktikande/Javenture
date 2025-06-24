package Basic_Arena;

public class Avg_Array {
    public static void main(String[] args) {

        int sum = 0;
        int arr[] = { 10, 25, 32, 45, 20, 56, 78 };
        System.out.println();

        System.out.println("Printing all array elemets");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Calculating Sum of an array as well as total length count");
        int length = arr.length;
        System.out.println(length);

        // Sum of array loop
        for (int i = 0; i <= length - 1; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Printing the sum");
        System.out.println(sum);
        
        System.out.println("Calculating average Now");
        double avg = 0;
        avg = sum / length;
        System.out.println(avg);
    }
}
