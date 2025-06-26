package Basic_Arena;

import java.util.Scanner;

public class Area_of_Reactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length");
        double length=sc.nextDouble();
        System.out.println("Enter the Width");
        double width=sc.nextDouble();

        System.out.println("Area of Reactangle" + " =" + length*width);
        sc.close();
    }
}