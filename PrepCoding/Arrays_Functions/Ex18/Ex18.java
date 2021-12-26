package PrepCoding.Arrays_Functions.Ex18;
import java.util.*;

public class Ex18 {
    // public static int BinarySearch(int array[], int start_index, int end_index, int element){
    //     if (end_index >= start_index){
    //        int middle = start_index + (end_index - start_index )/2;
    //        if (array[middle] == element)
    //           return middle;
    //        if (array[middle] > element)
    //           return BinarySearch(array, start_index, middle-1, element);
    //        return BinarySearch(array, middle+1, end_index, element);
    //     }
    //     return -1;
    //  }
    public static int BinarySearch(int a[], int l, int r, int k){
        
        if(l<=r){
            int m = l + (r - l) / 2;
            if(a[m]==k){
                return m;
            }else if(k>a[m]){
                return BinarySearch(a,m+1,r,k);
            }else if(k<a[m]){
                return BinarySearch(a,l,m-1,k);
            }
        }
        
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements in sorted order:");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the item you want to search");
        int k = sc.nextInt();

        int ind = BinarySearch(arr, 0, arr.length, k);
        if(ind==-1){
            System.out.println("Item "+k+" not found");
        }else{
            System.out.println("Item "+k+" found at :"+(ind+1));
        }
        sc.close();
    }
}
