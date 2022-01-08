package PrepCoding.Dynamic_Programming.Ex1;

import java.util.*;

public class Fibonacci {
    public static int FibonacciCalc(int n, int ar[]){
        if(n==0||n==1){
            // ar[n] = n;
            return n;   //can be 0 or 1, ie. value of n
        }

        int n1 = FibonacciCalc(n-1, ar);
        int n2 = FibonacciCalc(n-2, ar);
        int s = n1+n2;

        return s;
    }
    public static int FiboMemo(int n, int ar[]){
        if(n==0||n==1){
            // ar[n] = n;
            return n;   //can be 0 or 1, ie. value of n
        }
        if(ar[n]!=0){   // 0 if not recorded
            return ar[n];   
        }
        int n1 = FiboMemo(n-1, ar);
        int n2 = FiboMemo(n-2, ar);
        int s = n1+n2;
        ar[n] = s;
        return s;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();

        int res = FiboMemo(n, new int[n+1]);
        System.out.println("Fibonaci: "+res);
        sc.close();

    }
}
