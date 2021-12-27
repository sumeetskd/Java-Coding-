package PrepCoding.Arrays_Functions.Ex19;
import java.util.*;

public class Ex19 {
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
        System.out.println("Enter the array:");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the item to be searched:");
        int item = sc.nextInt();

        int floor = 0;
        int ceil = 0;
        int l = 0;
        int r = arr.length-1;
        if(arr[r]<item){
            sc.close();
            return;
        }
        int p = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            
            if (arr[m] == item){
                p = m;
                ceil = m;
                floor = m;
                break;
            }
            if (arr[m] < item){
                l = m + 1;
                ceil = r;

            }
            else{
                r = m - 1;
                floor = l;
            }
        }
 
    
        System.out.println("Item: found at position:"+(p+1));
        System.out.println("Ceil: "+arr[ceil]);
        System.out.println("Floor: "+arr[floor]);
        sc.close();
    }
}
