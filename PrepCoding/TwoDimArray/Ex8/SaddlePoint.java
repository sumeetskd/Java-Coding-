package PrepCoding.TwoDimArray.Ex8;

import java.util.*;

public class SaddlePoint {
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
        // int a[] = new int[n1];
        int point = 0;
        for(int i = 0; i<m1; i++){
            int min = arr1[i][0];
            int ind = 0;
            for(int j = 0; j<n1; j++){
                if(min>arr1[i][j]){
                    min = arr1[i][j];
                    ind = j;
                }
            }
            int max = 0;
            for(int k = 0; k<m1; k++){
                if(arr1[k][ind]>max){
                    max = arr1[k][ind];
                }
            }
            if(max==min){
                point = min;
                System.out.println("Shell Point: "+point);
                sc.close();

                return;
            }

        }
        System.out.println("Invalid Input");
        sc.close();
    } 
}
