package Basic_Arena;

public class Infinity_Loop {
    public static void main(String[] args) {
        int num=1;
        for(int i=num; num>=1; i++){
            System.out.println(num);
        }
    }
}
