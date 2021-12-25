package PrepCoding.Arrays_Functions.Ex16;
import java.util.*;

public class Ex16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
           arr[i] = sc.nextInt(); 
        }
        System.out.println("SubArrays:");
        // Integer to String: Integer.toString(i)
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+"\t");
                }
                System.out.println();
            }
           
        }
        sc.close();
    }
}
