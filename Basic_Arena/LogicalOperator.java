package Basic_Arena;

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Logical AND
        if (a > 5 && b > 15) {
            System.out.println("Both conditions are true (a > 5 && b > 15)");
        }

        // Logical OR
        if (a > 15 || b > 15) {
            System.out.println("At least one condition is true (a > 15 || b > 15)");
        }

        // Logical NOT
        boolean isJavaFun = true;
        if (!isJavaFun) {
            System.out.println("Java is not fun");
        } else {
            System.out.println("Java is fun!");
        }
    }
}
