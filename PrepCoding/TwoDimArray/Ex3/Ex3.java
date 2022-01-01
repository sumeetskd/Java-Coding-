package PrepCoding.TwoDimArray.Ex3;

import java.util.*;

public class Ex3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of first array:");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int arr1[][] = new int[m1][n1];
        System.out.println("Enter the first array elements:");
        for(int i = 0; i<m1; i++){
            for(int j = 0; j<n1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Spiral Traversal:");
        // int i = 0; 
        // int j = 0;
        int min_r = 0;
        int min_c = 0;
        int max_c = n1-1;
        int max_r = m1-1;
        int count = 0;
        int t = m1*n1;
        while(count<t){
            for(int i = min_r, j = min_c; i<=max_r && count<t; i++ ){
                System.out.println(arr1[i][j]);
                count++;
            }
            min_c++;
            for(int j = min_c, i=max_r; j<=max_c && count<t; j++){
                System.out.println(arr1[i][j]);
                count++;
            }
            max_r--;
            for(int i = max_r, j=max_c; i>=min_r && count<t; i--){
                System.out.println(arr1[i][j]);
                count++;    
            }
            max_c--;
            for(int j = min_c, i=min_r; j>=min_c && count<t; j--){
                System.out.println(arr1[i][j]);
                count++; 
            }
            min_r++;
        }
        sc.close();
    }
}
