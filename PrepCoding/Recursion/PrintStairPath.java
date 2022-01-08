package PrepCoding.Recursion;

import java.util.*;

public class PrintStairPath {
        //Levels and Option trick
        public static void printStairPath(int n, String path){
            if(n<0){
                return;
            } 
            if(n==0){
                System.out.println(path);
                return;
            }
            
            printStairPath(n-1, path+"1");
            printStairPath(n-2, path+"2");
            printStairPath(n-3, path+"3");

        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number");
            int n = sc.nextInt();
            printStairPath(n, " ");
            sc.close();
        }
}
