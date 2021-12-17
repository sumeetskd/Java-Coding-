package PrepCoding.Arrays_Functions;
import java.util.*;

public class Ex1 {
    public static void main(String args[]){
        //counting the number of repeating digits in a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the digit to know it's frequency:");
        int n2 = sc.nextInt();

        int count = 0;
        int t = n1;
        while(t>0){
            if(t%10==n2){
                count++;
            }
            t/=10;
        }
        System.out.println("Frequency of "+n2+" is "+count);
    }
}
