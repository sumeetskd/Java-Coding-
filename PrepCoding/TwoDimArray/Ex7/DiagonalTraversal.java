package PrepCoding.TwoDimArray.Ex7;

import java.util.*;


public class DiagonalTraversal {
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
        System.out.println("Diagonal Traversal");
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr1[0].length; j++){
                if(j>=i){
                    System.out.print(arr1[i][j]+"\t");
                    continue;
                }
                System.out.print("\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
