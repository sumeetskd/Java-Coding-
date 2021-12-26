package PrepCoding.Arrays_Functions.Ex18;
import java.util.*;

public class Ex18new {
    // Java implementation of recursive Binary Search
	// Returns index of x if it is present in arr[l..
	// r], else return -1
	public static int binarySearch(int arr[], int l, int r, int x)
	{
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, r, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	// Driver method to test above
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements in sorted order:");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the item you want to search");
        int k = sc.nextInt();

        int ind = binarySearch(arr, 0, arr.length, k);
        if(ind==-1){
            System.out.println("Item "+k+" not found");
        }else{
            System.out.println("Item "+k+" found at :"+(ind+1));
        }
        sc.close();
    }

}