package PrepCoding.Recursion;
import java.util.*;
public class Factorial {
    public static int Factorial(int n){
        if(n==1||n==0){
            return n;
        }
        int f = n*Factorial(n-1);
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Factorial:"+Factorial(n));
        sc.close();
    }
}
