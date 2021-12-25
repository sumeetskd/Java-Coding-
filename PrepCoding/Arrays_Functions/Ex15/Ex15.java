package PrepCoding.Arrays_Functions.Ex15;

import java.util.Scanner;

public class Ex15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
           arr[i] = sc.nextInt(); 
        }
        int inv[] = new int[n];
        System.out.println("Inverse of an Array:");
        for(int i = 0; i<n; i++){
            inv[arr[i]] = i;
        }
        for(int i = 0; i<n; i++){
            System.out.print(inv[i]+" ");
        }
        sc.close();
    }
}
