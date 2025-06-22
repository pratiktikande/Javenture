package Basic_Arena;

public class Continue {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Print all Number except 3");
        for(int i=0 ; i<=arr.length-1; i++){
            if(arr[i]==3){
                continue;
            }else{
                System.out.println(arr[i]);
            }
        }
    }
    
}
