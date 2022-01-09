package PrepCoding.Recursion;
import java.util.*;
public class PrintDecreasing {
    public static void NumberPrint(int n){
        //Decreasing
        if(n==0){
            return;
        }
        System.out.println(n);
        NumberPrint(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        NumberPrint(n);
        sc.close();
    }
}
