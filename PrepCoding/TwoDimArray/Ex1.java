package PrepCoding.TwoDimArray;

import java.util.Scanner;

public class Ex1 {
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

        System.out.println("Enter the dimension of second array:");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr2[][] = new int[m2][n2];
        System.out.println("Enter the second array elements:");
        for(int i = 0; i<m2; i++){
            for(int j = 0; j<n2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        if(n1!=m2){
            System.out.println("Multiplication is not possible");
            sc.close();
            return;
        }

        int k1 = m1;
        int k2 = n2;   
        int arr3[][] = new int[k1][k2];

        for(int i = 0; i<k1; i++){
            for(int j = 0; j<k2; j++){
                int m = 0;
                int n = 0;
                while(m!=n1&&n!=m2){
                    arr3[i][j]+=arr1[i][m]*arr2[n][j];
                    m++;
                    n++;
                }
            }
        }

        for(int i = 0; i<k1; i++){
            for(int j = 0; j<k2; j++){
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
