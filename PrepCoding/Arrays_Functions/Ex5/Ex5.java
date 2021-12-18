package PrepCoding.Arrays_Functions.Ex5;
import java.util.*;

public class Ex5 {
    public static int addition(int n1, int n2, int b){
        int res = 0;
        int p = 1;
        int pc = 0;

        int r1 = n1%10;
        int r2 = n2%10;
        int c = (r1+r2)/b;
        while(c>0){
            r1 = n1%10;
            r2 = n2%10;
            c = (r1+r2+pc)/b;
            int r = (r1+r2+pc)%b;
            res += r*p;
            p*=10;
            n1/=10;
            n2/=10;
            pc = c;
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
        int res = addition(n1, n2, b);
        System.out.println("Result is : "+res);
    }    
}
