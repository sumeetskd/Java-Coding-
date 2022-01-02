package PrepCoding.TwoDimArray.Ex4;
import java.util.*;

//exit point array
public class Ex4 {
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
        int count = 0;
        int min_i = 0;
        int min_j = 0;
        int i = 0;
        int j = 0;
        int row = 0;
        int col = 0;
        boolean b = true;
        while(b==true){
            //case 1
            for(i=min_i,j=min_j;j<n1&&b==true;j++){
                //count!=0
                // if(arr1[i][])
                if(arr1[i][j]==1&&count==0){
                    min_i++;    //check for indexbound
                    min_j = j;
                    row = i;
                    col = j;
                    count++;
                    break;
                }
                
                if(arr1[i][j]==0&&j==(n1-1)){
                    //exit
                    row = i;
                    col = j;
                    b = false;
                    break;
                }
                count++;
            }
            if(min_i==m1){
                b = false;
                continue;
            }
            //case2
            for(i = min_i,j=min_j; i<m1&&b==true; i++){
                if(arr1[i][j]==1){
                    min_i = i;
                    min_j--;    //check for indexbound
                    count++;
                    row = i;
                    col = j;
                    break;
                }
                if(arr1[i][j]==0&&i==(m1-1)){
                    //exit
                    row = i;
                    col = j;
                    b = false;
                    break;
                }
                count++;
            }
            if(min_j<0){
                b = false;
                continue;
            }
            //case3
            for(i = min_i,j=min_j; j>=0&&b==true; j--){
                if(arr1[i][j]==1){
                    min_i--;
                    min_j = j;
                    count++;
                    row = i;
                    col = j;
                    break;
                }
                if(arr1[i][j]==0&&j==0){
                    row = i;
                    col = j;
                    b = false;
                    break;
                }
                count++;
            }
            if(min_i<0){
                b=false;
                continue;
            }
            for(i = min_i, j = min_j; i>=0&&b==true; i--){
                if(arr1[i][j]==1){
                    min_i = i;
                    min_j++;
                    count++;
                    row = i;
                    col = j;
                    break;
                }
                if(arr1[i][j]==0&&i==0){
                    row = i;
                    col = j;
                    break;
                }
                count++;
            }
            if(min_j==n1){
                b = false;
                continue;
            }
        }
        System.out.println("Exit:"+(row+1)+", "+(col+1));
    }
}
