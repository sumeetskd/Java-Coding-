package PrepCoding.TwoDimArray.Ex4;

import java.util.*;

public class Ex4_new {
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
        int count = 0;
        // int min_i = 0;
        // int min_j = 0;
        int i = 0;
        int j = 0;
        // int row = 0;
        // int col = 0;
        // boolean b = true;
        while(true){
            count = (count+arr1[i][j])%4;
            if(count==0){
                j++;
            }
            else if(count==1){
                i++;
            }else if(count==2){
                j--;
            }else{
                i--;
            }

            if(i<0){
                i++;
                break;
            }else if(j<0){
                j++;
                break;
            }else if(i==arr1.length){
                i--;
                break;
            }else if(j==arr1[0].length){
                j--;
                break;
            }
        }
        System.out.println("Exit:"+(i)+", "+(j));
        sc.close();
    }
}

