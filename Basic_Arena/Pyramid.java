package Basic_Arena;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number For Pyramid");
        int num = sc.nextInt();
        sc.close();
        // Star Pattern 
        for(int i=0; i<=num; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}