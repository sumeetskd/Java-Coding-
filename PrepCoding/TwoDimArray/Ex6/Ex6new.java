package PrepCoding.TwoDimArray.Ex6;
import java.util.*;

public class Ex6new {
    public static void rotateShell(int arr[][], int s, int r){
        int[] oned = fillOnedFromShell(arr,s);
        rotate(oned,r);
        fillShellFromOned(arr, s, oned);
        display(arr);
    }
    public static void display(int arr[][]){
        System.out.println("Display:");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static int[] fillOnedFromShell(int arr[][], int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int s2 = 2*(maxr-minr+maxc-minc);
        int oned[] = new int[s2];

        int ind = 0;
        //lw
        for(int i = minr, j = minc; i<=maxr; i++){
            oned[ind] = arr[i][j];
            ind++;
        }
        //bw
        for(int i = maxr, j=minc+1; j<=maxc; j++){
            oned[ind] = arr[i][j];
            ind++;
        }
        //rw
        for(int i = minr, j = maxc; i<maxr; i++){
            oned[ind] = arr[i][j];
            ind++;
        }
        //tw
        for(int i = minr, j=minc; j<maxc; j++, i++){
            oned[ind] = arr[i][j];
            ind++;
        }
        return oned;
    }
    public static void fillShellFromOned(int arr[][], int s, int oned[]){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        // int s2 = 2*(maxr-minr+maxc-minc);
        

        int ind = 0;
        //lw
        for(int i = minr, j = minc; i<=maxr; i++){
            arr[i][j] = oned[ind];
            ind++;
        }
        //bw
        for(int i = maxr, j=minc+1; j<=maxc; j++){
            arr[i][j] = oned[ind];
            ind++;
        }
        //rw
        for(int i = minr, j = maxc; i<maxr; i++){
            arr[i][j] = oned[ind];
            ind++;
        }
        //tw
        for(int i = minr, j=minc; j<maxc; j++, i++){
            arr[i][j] = oned[ind];
            ind++;
        }
    }
    public static void reverse(int[] oned, int s, int l){
        
        for(int i = s, j = l; i<j; i++,j--){
            int t = oned[i];
            oned[i] = oned[j];
            oned[j] = t;
        }
    }
    public static void rotate(int[] oned, int r){
        //invert p1, invert p2, invert whole
        //rotation is anticlockwise in this example
        int k = r%oned.length;
        if(k<0){
            k = oned.length+k;
        }
        
        reverse(oned, 0,oned.length-r-1);
        reverse(oned, oned.length-r, oned.length-1);
        reverse(oned, 0, oned.length);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of first array:");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int arr1[][] = new int[m1][n1];
        System.out.println("Enter the first array elements:");
        for(int i = 0; i<m1; i++){
            for(int j = 0; j<n1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the shell number:");
        int s = sc.nextInt();
        System.out.println("Enter the number of rotations:");
        int r = sc.nextInt();
        rotateShell(arr1,s,r);
        
        sc.close();
    }
}
