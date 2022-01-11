package PrepCoding.Recursion;

import java.util.*;

public class TowerHanoi {
    public static void tower(int n, int t1, int t2, int t3){
        if(n==0){
            return;
        }
        tower(n-1,t1,t3,t2);    //prints the instruction to move
        System.out.println(n+"["+t1+"->"+t2+"]");
        tower(n-1,t3,t2,t1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        // int arr[] = new int[n];
        System.out.println("Enter the numbers:");
        // for(int i = 0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        tower(n, t1,t2,t3);
        sc.close();
    }
}
