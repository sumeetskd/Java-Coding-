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
        
        int k = n1>=n2?n1:n2;
        int add[] = new int[k];
        int c = 0;
        int d = 0;
        if(n1==n2){
            
            for(int i = n1-1; i>=0; i--){
                d = arr1[i]+arr2[i]+c;
                if(d>10&&i==0){
                    add[i] = d%10;
                    c = d/10;
                    System.out.println(c);
                    continue;
                }
                c = d/10;
                
                add[i] = d%10;
                
            }
        }
        else if(n1>n2){

            int j = n2-1;
            for(int i = k-1; i>=0; i--){
                if(j>=0){
                    d = arr1[i]+arr2[j]+c;
                    c = d/10;
                    j--;
                    add[i] = d%10;
                    continue;
                }
                d = arr1[i]+c;
                if(d>=10&&i==0){
                    add[i] = d%10;
                    c = d/10;
                    System.out.println(c);
                    continue;
                }
                add[i] = d%10;

            }
        }
        else{

            int j = n1-1;
            for(int i = k-1; i>=0; i--){
                if(j>=0){
                    d = arr1[j]+arr2[i]+c;
                    c = d/10;
                    j--;
                    add[i] = d%10;
                    continue;
                }
                d = arr2[i]+c;
                if(d>=10&&i==0){
                    add[i] = d%10;
                    c = d/10;
                    System.out.println(c);
                    continue;
                }
                add[i] = d%10;
            }
        }
        // if(c>=1){
            
        // }
        for(int i = 0; i<k; i++){
            System.out.println(add[i]);
        }


        sc.close();
    }
}
