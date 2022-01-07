package PrepCoding.TwoDimArray.Ex9;

import java.util.*;

public class SearchNumber{
    public static int binarySearch(int arr[], int k){
        int ind = -1;
        int i = 0;
        int l = arr.length-1;
        while(i<l){
            int m = i+(l-i)/2;
            if(arr[m]==k){
                ind = m;
                break;
            }
            if(arr[m]<k){
                i = m+1;
            }else if(arr[m]>k){
                l = m-1;
            }
        }
        return ind;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of array: ");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int arr1[][] = new int[m1][n1];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i<m1; i++){
            for(int j = 0; j<n1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int n = 0;
        System.out.println("Enter the number you want to search: ");
        int item = sc.nextInt();
        int a[] = new int[arr1[0].length];
        int x = -1;
        for(int i = 0; i<m1; i++){
            for(int j = 0; j<n1; j++){
                a[j] = arr1[i][j];
            }
            n = binarySearch(a, item);
            if(n!=-1){
                x = i;
                break;
            }
        }
        System.out.println("Search: "+x+","+n);
        sc.close();
    } 
}