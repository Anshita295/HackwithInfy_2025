import java.util.*;
public class TwoCholate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int money=sc.nextInt();
        System.out.println(buyChoco(arr,money));

        
    }
    public static int buyChoco(int[] arr, int money) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[0]+arr[1]<=money){
                return money-(arr[0]+arr[1]);
            }
        }
        return money;
    }
}
