package PrepCoding.Recursion;
import java.util.*;

public class AllIndices {
    public static int[] allIndicesArray(int arr[], int idx, int e, int fsf){
        if(arr.length==idx){
            return new int[fsf];
        }
        
        if(arr[idx]==e){
            int iarr[] = allIndicesArray(arr, idx+1, e, fsf+1);
            iarr[fsf] = idx;
            return iarr;
        }else{
            int iarr[] = allIndicesArray(arr, idx+1, e, fsf);
            return iarr;
        }
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
        int idx[] = allIndicesArray(arr,0,c,0);
        System.out.println("Item:"+c+" Found at position:");
        for(int i:idx){
            System.out.println(i);
        }
        sc.close();
    }
}
