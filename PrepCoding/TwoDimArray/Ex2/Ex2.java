package PrepCoding.TwoDimArray.Ex2;
import java.util.*;

public class Ex2 {
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

        System.out.println("Wave Traversal:");
        int i = 0; 
        int j = 0;
        while(j<n1){
            if((j+1)%2==0){
                while(i>=0){
                    System.out.println(arr1[i][j]);
                    i--;
                }  
                i++;
            }else{
                while(i<m1){
                    System.out.println(arr1[i][j]);
                    i++;
                }
                i--;
            }
            System.out.println("");
            j++;
        }

        sc.close();
    } 
}
