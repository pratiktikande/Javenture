package Basic_Arena;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={10,78,23,45,96,36};
        int key=45;

        for(int i=0; i<=arr.length-1; i++){
            if(key==arr[i]){
                System.out.println("Key found at index " + i);
            }
        }
    }
    
}

// Alternate Option
//  public static void main(String[] args) {
//         int arr[] = {10, 78, 23, 45, 96, 36, 45};
//         int key = 45;
//         int index = -1; // -1 means key not found yet

//         for (int i = 0; i < arr.length; i++) {
//             if (key == arr[i]) {
//                 System.out.println("Key found at index " + i);
//                 index = i; // Store the index of the key
//             }
//         }

//         if (index == -1) {
//             System.out.println("Key not found");
//         }
//     }