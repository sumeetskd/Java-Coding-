package PrepCoding.Arrays_Functions;
import java.util.*;

//Converting number of any given base into decimal
public class Ex3 {
    public static int DecimalEqui(int n1, int n2){
        //multiply the individual digits to the power of(base,starting from 0), 
        int res = 0;
        int pow = 1;
        int t = n1;
        while(t>0){
            int rem = t%10;
            res+=rem*pow;
            t/=10;
            pow = pow*n2;
        }
        return res;

    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the base of the number:");
        int n2 = sc.nextInt();
        int r = DecimalEqui(n1, n2);
        System.out.println("The decimal equivalent of the number is: "+r);
    }
}
