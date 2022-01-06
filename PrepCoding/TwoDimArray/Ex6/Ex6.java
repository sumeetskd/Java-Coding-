package PrepCoding.TwoDimArray.Ex6;
import java.util.*;

public class Ex6 {
    public static void rotation(int arr[][], int s){
        int s_index = s-1;
        // int t = 0;
        int tc = 0;
        int lc = 0;
        int bc = 0;
        // int rc = 0;
        
        //top rotation
        for(int j = s_index,i = s_index; j<arr[0].length-s_index-1; j++){
            if(j==i){
                tc = arr[i][j];
                continue;
            }
            if(j==arr[0].length-s-1){
                arr[i][j] = arr[i+1][j];
                continue;
            }
            arr[i][j] = arr[i][j+1];
        }
        //left rotation
        for(int j = s_index,i=arr.length-1-s_index;i>s_index; i--){
            if(i==arr.length-1-s_index){
                lc = arr[i][j];
                continue;
            }
            if(i-1==j){
                arr[i][j] = tc;
                continue;
            }
            arr[i][j] = arr[i-1][j];
        }
        //bottom rotation
        for(int j = arr[0].length-1-s_index, i = arr.length-1-s_index; j>s_index; j--){
            if(j==s_index+1){
                arr[i][j] = lc;
                continue;
            }
            if(j==arr[0].length-1-s_index){
                bc = arr[i][j];
                continue;
            }
            arr[i][j] = arr[i][j-1];
        }
        //right rotation
        for(int j = arr[0].length-1-s_index, i=s_index; i<arr.length-1-s_index; i++){
            if(i==arr.length-2-s_index){
                arr[i][j] = bc;
                continue;
            }
            arr[i][j] = arr[i+1][j];
        }
    }
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
        System.out.println("Enter the shell number:");
        int s = sc.nextInt();
        System.out.println("Enter the number of rotations:");
        int r = sc.nextInt();

        // if(r<0){
        //     r = 
        // }
        while(r!=0){
            rotation(arr1,s);
            r--;
        }
        System.out.println("Rotation:");
        for(int i = 0; i<m1; i++){
            for(int j = 0; i<n1; j++){
                System.out.println(arr1[i][j]);
            }
        }
        sc.close();
    }
}
