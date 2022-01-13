package PrepCoding.Recursion;
import java.util.*;

public class MaxArray {
    public static int maxOfArray(int[] arr, int idx){
        if(idx==0){
            return arr[idx];
        }
        int max = maxOfArray(arr, idx-1);
        // maxOfArray(arr, idx-1);
        if(max>arr[idx]){
            return max; 
        }else{
            return arr[idx];
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int n = sc.nextInt();

        System.out.println("Enter the array content:");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum:");
        int max = maxOfArray(arr, n-1);
        System.out.println(max);
        sc.close();
    }
    
}
