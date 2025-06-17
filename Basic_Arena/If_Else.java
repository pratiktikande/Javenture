package Basic_Arena;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        if(num>18)
        System.out.println("You are 18+");
        else{
            System.out.println("You are Not 18+");
        }
        sc.close();
    }
}
