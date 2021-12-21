package PrepCoding.Arrays_Functions;
import java.util.*;
import java.lang.Math;
public class Ex2 {
    public static int DecimalToBase(int n, int b){
        //reminder is multiplied with 10^base and added
        int t = n;
        int sum = 0;
        // int count=0;
        int pow = 1;    //10^0 = 1;
        while(t>0){
            
            int r = t%b;
            t/=b;
            sum+=r*pow;
            pow*=10;
            // sum = sum+r*((int)Math.pow(10,count));
            // count++;
        }
        return sum;
    }
    public static void main(String args[]){
        //decimal to any base
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the base:");
        int b = Integer.parseInt(sc.nextLine());
        int res = DecimalToBase(n, b);
        System.out.println("The Result is "+res);
        sc.close();
    }
}
