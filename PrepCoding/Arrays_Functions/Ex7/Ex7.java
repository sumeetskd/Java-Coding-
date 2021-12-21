package PrepCoding.Arrays_Functions.Ex7;
import java.util.*;

public class Ex7 {
    public static int addition(int n1, int n2, int b){
        int res = 0;
        int p = 1;
        // int pc = 0;
        int c = 0;
        // int r1 = n1%10;
        // int r2 = n2%10;
        // int c = (r1+r2)/b;
        while(n1>0||n2>0||c>0){
            int r1 = n1%10;
            int r2 = n2%10;
            c = (r1+r2+c)/b;
            int r = (r1+r2+c)%b;
            res += r*p;
            p*=10;
            n1/=10;
            n2/=10;
        }
        return res;

    }
    public static int singleDigitProduct(int n1, int r2, int b ){
        int res = 0;
        int c = 0;
        int p = 1;
        while(n1>0||c>0){
            int r1 = n1%10;
            int m = r1*r2+c;

            c = m/b;
            int r = m%b;

            res = res + r*p;
            p=p*10;

            n1/=10;
        }

        return res;

    }
    public static int Multiply(int n1, int n2, int b){
        int res = 0;
        //muliply the digits of n1 to digits of n2, then add those results

        int pow = 1;
        while(n2>0){
            // int r1 = n1%10;
            int r2 = n2%10;
            int a1 = singleDigitProduct(n1, r2, b);
            n2/=10;
            res = addition(a1*pow, res, b);
            pow*=10;
            System.out.println("Single Product: "+a1);
            System.out.println(res);
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int n2 = sc.nextInt();
        System.out.println("Enter the base:");
        int b = sc.nextInt();
        int res = Multiply(n1, n2, b);
        System.out.println("Result is : "+res);
        sc.close();
    }
    
}
