package PrepCoding.Arrays_Functions.Ex8;
import java.util.*;

public class Ex8 {
    public static void calculateMaxMin(int temp[]){
        //here temp will act as a reference to arr, as their is no
        //allocation of memory(in the heap) to temp using "new" keyword
        int max = temp[0];
        int min = temp[0];
        for(int i = 0; i<temp.length; i++){
            if(min>temp[i]){
                min = temp[i];
            }
            if(max<temp[i]){
                max = temp[i];
            }
        }
        System.out.println("Max: "+max+" and Min: "+min);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[];  // space allorted in stack
        arr = new int[n]; //space allorted in the heap area, dynamic allocation of memory takes place 
        // now arr, in the stack will have the address of arr[0] index from heap
        //data values will be stored in the heap area on the area of array

        System.out.println("Enter the array elements:");
        for(int i =0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        calculateMaxMin(arr);
        sc.close();
    }
}
