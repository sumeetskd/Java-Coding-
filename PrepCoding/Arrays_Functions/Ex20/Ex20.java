package PrepCoding.Arrays_Functions.Ex20;
import java.util.*;

public class Ex20 {
    public static int BinarySearch(int arr[],int item,int l, int r){
        
        int p = -1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(arr[m]==item){
                p = m;
                break;
            }
            if(arr[m]>item){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return p;
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
        int l = 0;
        int r = arr.length-1;
        int first = 0;
        int last = 0;
        System.out.println("Enter the item you want to search:");
        int item = sc.nextInt();
        int p = 0;
        while(l<=r){
            int m = l+(r-l)/2;
            if(arr[m]==item){
                p = m;
                l = m+1;
            }
            if(arr[m]>item){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        last = l;
        while(l<=r){
            int m = l+(r-l)/2;
            if(arr[m]==item){
                p = m;
                r = m-1;
            }
            if(arr[m]>item){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        first = r;
        
        System.out.println("First:"+first+" & Last:"+last);
        sc.close();
    }    
}
