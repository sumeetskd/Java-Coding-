package PrepCoding.Arrays_Functions;
import java.util.*;

//any base to any base
public class Ex4 {
    public static int anyBaseCovert(int n, int b1, int b2){
        int res = 0;
        //convert to decimal
        int t = n;
        int p = 1;
        int dec=0;
        while(t>0){
            int r = t%10;
            dec+=r*p;
            t/=10;
            p=p*b1;
        }
        //dec is the required decimal number, now let's convert it to base b2
        p = 1;
        int t1 = dec;
        while(t1>0){
            int r = t1%b2;
            t1/=b2;
            res+=r*p;
            p*=10;
            
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the base of the number:");
        int b1 = sc.nextInt();
        System.out.println("Enter the base you want to convert to:");
        int b2 = sc.nextInt();
        int res = anyBaseCovert(n, b1, b2);
        System.out.println("Result is "+res);
        sc.close();
    }
}
