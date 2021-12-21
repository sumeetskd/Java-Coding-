package PrepCoding.Arrays_Functions.Ex9;
import java.util.*;
public class Ex9 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search:");
        int s = sc.nextInt();
        // int f = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]==s){
                System.out.println(s+" is present at position "+(i+1)+".");
                return;
            }
        }
        System.out.println(s+" is not present in the array.");
        sc.close();
    }
}
