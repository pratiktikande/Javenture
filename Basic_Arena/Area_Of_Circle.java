package Basic_Arena;

import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {

        System.out.println("area Of circle formula is PiR^2");
        System.out.println("Enter the value of Radius");
        Scanner sc = new Scanner(System.in);
        double d=sc.nextDouble();
        double Area =(3.14159*(Math.pow(d, 2)));
        System.out.println(Area);
        sc.close();
    }
}
