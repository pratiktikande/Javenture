package Basic_Arena;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        switch (num) {
            case 0:
                System.out.println("The Value is 0");
                break;
            case 1:
                System.out.println("The Value is 1");
                break;
            case 2:
                System.out.println("The Value is 2");
                break;
            case 3:
                System.out.println("The Value is 3");
                break;
            case 4:
                System.out.println("The Value is 4");
                break;
            case 5:
                System.out.println("The Value is 5");
                break;
            default:
                System.out.println(" Value Exceeds More than 5");
                break;
        }
        sc.close();
    }
}
