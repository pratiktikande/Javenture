package Basic_Arena;

import java.util.Scanner;

public class Free_Flowing_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        //Without Break , it will execute all the lines of code

        switch (num) {
            case 0:
                System.out.println("Sunday");
            case 1:
                System.out.println(" Monday");
            case 2:
                System.out.println(" Tuesday");
            case 3:
                System.out.println(" Wensday");
            case 4:
                System.out.println(" Thusday");
            case 5:
                System.out.println(" Friday");
            case 6:
                System.out.println(" Sat");
            default:
                System.out.println("Invalid");
        }

        sc.close();
    }
}
