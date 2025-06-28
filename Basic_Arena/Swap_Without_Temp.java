package Basic_Arena;

public class Swap_Without_Temp {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        System.out.println("Number Before Swap");
        System.out.println(a);
        System.out.println(b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap");
        System.out.println(a);
        System.out.println(b);

    }
}
