package Basic_Arena;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci numbers to print:");
        int num = sc.nextInt(); 
        
        int a = 0, b = 1;  // First two terms of the sequence

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            // Calculate the next term
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}