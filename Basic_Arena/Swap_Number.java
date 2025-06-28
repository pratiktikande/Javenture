package Basic_Arena;

import java.util.Scanner;

public class Swap_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int Num=sc.nextInt();
        System.out.println("Enter Second Number");
        int Num2=sc.nextInt();

        int temp=Num;
        Num=Num2;
        Num2=temp;
        System.out.println("Number After Swap");
        System.out.println(Num);
        System.out.println(Num2);
        sc.close();
    }
}
