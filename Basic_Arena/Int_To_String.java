package Basic_Arena;

public class Int_To_String {
    public static void main(String[] args) {
        int a =45;
        System.out.println("Integer" + a);
        String s1=Integer.toString(a);
        System.out.println("Converted To String");
        System.out.println(s1);
        System.out.println("Printing the type of s1");
        System.out.println(s1.getClass().getName());
    }
}
