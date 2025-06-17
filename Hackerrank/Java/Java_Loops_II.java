import java.util.Scanner;

public class Java_Loops_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases=sc.nextInt();

        for(int i=0; i<testcases; i++){
            int a= sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();


            int sum=a;

            for(int j=0; j<c; j++){
                sum = sum +(int)(Math.pow(2, j) * b);
                System.out.print(sum +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
