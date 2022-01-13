package PrepCoding.Recursion;
import java.util.*;

public class ArrayReverse {
    public static void displayArr(int[] arr, int idx){
        if(idx<0){
            return;
        }
        displayArr(arr,idx-1);
        System.out.println(arr[idx]);
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
        System.out.println("Array Elements:");
        displayArr(arr, n-1);
        sc.close();
    }
}
