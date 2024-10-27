import java.util.Scanner;

public class lower_bound {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 30, 30, 30, 30, 40, 50, 60, 70};
        int n = arr.length;

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int lowerBound = n;  // Default value if no element is greater or equal to target
        int UpperBound = n;  

        // Edge case: if the target is larger than the largest element
        if (target > arr[n - 1]) {
            System.out.println("Lower Bound: " + n);
        } 
        // Edge case: if the target is smaller than the smallest element
        else if (target < arr[0]) {
            System.out.println("Lower Bound: 0");
        } 
        else {
            // Binary search to find the lower bound
            while (low <= high) {
                int mid = (low + high) / 2;
                
                if (arr[mid] >= target) {               // if you remove the =, it will be upper bound

                    lowerBound = Math.min(lowerBound, mid);
                    high = mid - 1;
                } 
                // If arr[mid] is less than target, we move right
                else{
                    low = mid + 1;
                }
            }
            // After the loop, lowerBound contains the index of the first element >= target
            System.out.println("Lower Bound: " + lowerBound);

            while (low <= high) {
                int mid = (low + high) / 2;
                
                if (arr[mid] >= target) {               // if you remove the =, it will be upper bound

                    UpperBound = Math.min(UpperBound, mid);
                    high = mid - 1;
                } 
                // If arr[mid] is less than target, we move right
                else{
                    low = mid + 1;
                }
            }
            // After the loop, lowerBound contains the index of the first element >= target
            System.out.println("Upper Bound: " + UpperBound);
        }

        sc.close();
    }
}
