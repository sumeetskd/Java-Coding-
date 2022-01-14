package PrepCoding.Recursion;
import java.util.*;

public class ListIndexOccurence {
    public static int FindOccur(int arr[], int idx, int e){
        if(arr.length==idx){
            return -1;
        }
        if(arr[idx]==e){
            int k = FindOccur(arr,idx,e);
        }
        int k = FindOccur(arr,idx,e);
        if(k==)
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int n = sc.nextInt();

        System.out.println("Enter the array content:");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number:");
        int c = sc.nextInt();

        System.out.println("Occurence:");
        int idx = FindOccur(arr,0,c);
        if(idx==-1){
            System.out.println("Not Found in the array");

        }else{
            System.out.println("Found at index:"+idx);

        }
        sc.close();
    }
}
