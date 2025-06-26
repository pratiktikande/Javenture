package Basic_Arena;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int fact=1;
        int Num = sc.nextInt();
        for(int i=Num; i>0; i--){
            fact = fact * i;
        }
        System.out.println(fact);
     sc.close();   
    }
}
