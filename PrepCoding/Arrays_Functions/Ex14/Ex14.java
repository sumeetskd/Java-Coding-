package PrepCoding.Arrays_Functions.Ex14;
import java.util.*;

public class Ex14 {
    public static void Rotate(int arr[], int k){
        
        int r = k%arr.length;
        // System.out.println("Mod: "+r);
        if(r<0){
            r = arr.length+r;
            
        }
        while(r>0){
            int d = arr[arr.length-1];
            int pv = 0;
            for(int i = 0; i<arr.length; i++){
                pv = arr[i];
                arr[i] = d;
                d = pv;
            }
            r--;
        }
    }
    public static void Display(int arr[]){
        System.out.println("Rotated array:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no. of rotations:");
        int k = sc.nextInt();

        Rotate(arr,k);
        Display(arr);
        sc.close();
    }
}
