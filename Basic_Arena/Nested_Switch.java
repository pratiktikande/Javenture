package Basic_Arena;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter department number (1 or 2):");
        int department = sc.nextInt();

        switch (department) {
            case 1:
                System.out.println("Department 1 selected.");
                System.out.println("Enter role (1 = Manager, 2 = Employee):");
                int role1 = sc.nextInt();

                switch (role1) {
                    case 1:
                        System.out.println("You are a Manager in Department 1.");
                        break;
                    case 2:
                        System.out.println("You are an Employee in Department 1.");
                        break;
                    default:
                        System.out.println("Invalid role in Department 1.");
                }
                break;

            case 2:
                System.out.println("Department 2 selected.");
                System.out.println("Enter role (1 = Manager, 2 = Employee):");
                int role2 = sc.nextInt();

                switch (role2) {
                    case 1:
                        System.out.println("You are a Manager in Department 2.");
                        break;
                    case 2:
                        System.out.println("You are an Employee in Department 2.");
                        break;
                    default:
                        System.out.println("Invalid role in Department 2.");
                }
                break;

            default:
                System.out.println("Invalid department.");
        }

        sc.close();
    }
}
