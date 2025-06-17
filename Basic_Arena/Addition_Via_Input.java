package Basic_Arena;

import java.util.Scanner;

public class Addition_Via_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Digit");
        int a = sc.nextInt();
        System.out.println("Enter Second Digit");
        int b= sc.nextInt();
         System.out.println( "Sum" + " = " + (a+b));
        sc.close();
    }
}
