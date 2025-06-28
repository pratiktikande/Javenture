package Basic_Arena;

import java.util.Scanner;

public class Increment_Decrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println("After Increment Operator");
        num++;
        System.out.println(num);
        num++;
        System.out.println(num);
        System.out.println("After Decremnet Operator");
        num--;
        System.out.println(num);
        num--;
        System.out.println(num);
        sc.close();
    }
}
