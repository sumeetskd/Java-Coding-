package PrepCoding.Arrays_Functions.Ex10;
import java.util.*;
public class Ex10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i>=(n-arr[j])){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
