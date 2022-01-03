package PrepCoding.TwoDimArray.Transpose;
import java.util.*;
public class Transpose {
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
        for(int i = 0; i<m1; i++){
            for(int j = i; j<n1; j++){
                int t= arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = t;

            }
        }
        System.out.println("Transpose:");
        for(int i = 0; i<m1; i++){
            for(int j = 0; j<n1; j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Rotate:");
        int arr[][] = new int[n1][m1];
        for(int i =0 ; i<m1; i++){
            for(int j = n1-1,k=0; j>=0; j--, k++){
                arr[k][i] = arr1[i][j];
            }
        }
       
        for(int i = 0; i<n1; i++){
            for(int j = 0; j<m1; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
