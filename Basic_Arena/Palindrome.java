package Basic_Arena;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int savenum=num;
        int reverse=0;

        while(num !=0){
            int lastdigit = num%10;
            reverse = reverse *10 + lastdigit;
            num = num/10;
        }
        if(savenum==reverse){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
        sc.close();
    }
}
