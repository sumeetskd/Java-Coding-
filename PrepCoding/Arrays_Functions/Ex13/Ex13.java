package PrepCoding.Arrays_Functions.Ex13;

import java.util.*;
//Reverse an array

public class Ex13 {
    public static void Reverse(int arr[]){
        int j = arr.length-1;
        int i = 0;
        // int m = arr.length/2;
        // while(i<=m && j>=m){
        //     int t = arr[j];
        //     arr[j] = arr[i];
        //     arr[i] = t;
        //     i++;
        //     j--;
        // }
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        System.out.println("Reverse:");
        for(int i1 = 0; i1<arr.length; i1++){
            System.out.println(arr[i1]);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Reverse(arr);
        sc.close();
    }
}
