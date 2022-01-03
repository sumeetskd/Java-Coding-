package PrepCoding.TwoDimArray.Ex5;

import java.util.*;

public class Ex5 {
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
        int arr[][] = new int[n1][m1];
        
        for(int l = 0; l<n1; l++){
            for(int k = m1-1,k1 = 0; k>=0; k--,k1++){
                arr[l][k1] = arr1[k][l];
            }
        }

        System.out.println("Rotation:");
        for(int i = 0; i<n1; i++){
            for(int j = 0; j<m1; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
