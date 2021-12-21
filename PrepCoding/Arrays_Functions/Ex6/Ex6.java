package PrepCoding.Arrays_Functions.Ex6;
import java.util.*;

public class Ex6 {
    public static int subtraction(int n1, int n2, int b){
        int res = 0;
        int p = 1;
        int pc = 0;

        int r1 = n1%10;
        int r2 = n2%10;
        // int c = (r1-r2)/b;
        int c = 0;
        int r = 0;
        while(n1>0||n2>0||c>0){
            r1 = (n1%10)-pc;
            r2 = n2%10;
            if(r1>=r2){
                r = (r1-r2);
                pc = 0;

            }else{
                r = (r1+b)-r2;
                pc = 1;
            }
            // c = (r1+r2+pc)/b;
            
            res += r*p;
            p*=10;
            n1/=10;
            n2/=10;
            // pc = c;
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
        int res = subtraction(n1, n2, b);
        System.out.println("Result is : "+res);
        sc.close();
    }    
}
