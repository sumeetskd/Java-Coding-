package PrepCoding.Arrays_Functions.Ex11;
import java.util.*;
public class Ex11 {
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
        int max_size = n1<n2?n2:n1;
        int add[] = new int[max_size];
        if(n1==n2){
            for(int i = 0; i<n2; i++){
                add[i] = arr2[i]+arr1[i];
            }
        }
        else if(n1>n2){
            int j = n2-1;
            for(int i = n1-1; i>=0; i--){
                if(i>n1-n2-1){
                    add[i] = arr1[i]+arr2[j];
                    j--;
                    continue;
                }
                add[i] = arr1[i];
            }
            
        }else{
            int j = 0;
            for(int i = 0; i<n2; i++){
                if(i>n2-n1-1){
                    add[i] = arr1[j]+arr2[i];
                    j++;
                    continue;
                }

                add[i] = arr2[i];
            }
        }
        for(int i = 0; i<add.length; i++){
            System.out.println(add[i]);
        }
    }
}
