package PrepCoding.Arrays_Functions.Ex11;
import java.util.*;
public class Ex11_optm {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n1 = sc.nextInt();

        System.out.println("Enter the 1st array elements: ");
        int arr1[] = new int[n1];
        for(int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of second array: ");
        int n2 = sc.nextInt();
        
        System.out.println("Enter the 2nd array elements: ");
        int arr2[] = new int[n2];
        
        for(int i = 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("Addition:");
        
       
        int add[] = new int[n1>=n2?n1:n2];
        int c = 0;
        int d = 0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = add.length-1;

        while(k>=0){
            d = c;
            if(i>=0){
                d += arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            c = d/10;
            d = d%10;
            add[k] = d;
            k--;
            i--;
            j--;
        }
        if(c!=0){
            System.out.println(c);
        }
        for(int m = 0; m<add.length; m++){
            System.out.println(add[m]);
        }
        sc.close();
    }
}
