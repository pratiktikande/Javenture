package Basic_Arena;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reverse = 0;
        System.out.println("Enter the Number to Reverse");
        int Num = sc.nextInt();

        while (Num != 0) {
            int lastdigit = Num % 10;
            reverse = reverse * 10 + lastdigit; 
            Num = Num / 10;
        }
        sc.close();
        System.out.println(" Reverse Number");
        System.out.println(reverse);
    }
}
