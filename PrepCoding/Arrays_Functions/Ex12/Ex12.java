package PrepCoding.Arrays_Functions.Ex12;
import java.util.*;

public class Ex12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n1 = sc.nextInt();
        System.out.println("Enter the 1st array elements:");
        int arr1[] = new int[n1];
        for(int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of second array:");
        int n2 = sc.nextInt();
        System.out.println("Enter the 2nd array elements:");
        int arr2[] = new int[n2];
        for(int i = 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        int d = 0;
        int c = 0;
        int i = n1-1;
        int j = n2-1;
        int k = n2-1;
        int sub[] = new int[n2];
        while(k>=0){
            d = arr2[j]-c;
            if(i>=0){
                if(d<arr1[i]){
                    d = (d+10)-arr1[i];
                    c = 1;
                }else{
                    d = d-arr1[i];
                    c = 0;
                }
            }
            sub[k] = d;
            k--;
            j--;
            i--;
        }
        System.out.println("Subtraction:");
        int t = 0;
        for(int i1 = 0; i1<sub.length; i1++){
            if(t==0&&sub[i1]==0){
                continue;
            }else{
                t = 1;
            }
            System.out.println(sub[i1]);
        }
        sc.close();
    }
}
