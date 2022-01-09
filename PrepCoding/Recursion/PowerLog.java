package PrepCoding.Recursion;
import java.util.*;
public class PowerLog {
    public static int power(int n, int p){
        if(p==0){
            return 1;
        }
        int x = power(n,p/2);
        int m = x*x;
        if(p%2==1){
            m = m*n;
        }
        return m;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the power:");
        int p = sc.nextInt();
        int k = power(n,p);
        System.out.println("Power:"+k);
        sc.close();
    } 
}
