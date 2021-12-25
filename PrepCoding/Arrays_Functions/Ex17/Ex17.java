package PrepCoding.Arrays_Functions.Ex17;
import java.util.*;

public class Ex17 {
    //to find the sebsets
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
           arr[i] = sc.nextInt(); 
        }
        System.out.println("SubArrays:");
        // Integer to String: Integer.toString(i)
        int limit = (int)Math.pow(2, arr.length); // use it like binary number from 0 to limit=>no. of subsets
        for(int i = 0; i<limit; i++){
            String s = " ";
            int t = i;
            for(int j = n-1; j>=0; j--){
                int r = t%2;
                t = t/2;
                if(r==0){
                    s='-'+"\t"+s;
                }
                else{
                    s = arr[j]+"\t"+s;
                }
            }
            System.out.println(s);
        }
        sc.close();
    }
}
