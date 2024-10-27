import java.util.Scanner;

public class leetCode_thirtyFour {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};

        Scanner sc = new Scanner (System.in);
        int target = sc.nextInt();

        int[] ans = Searchrange(arr, target);

        for(int ele : ans){
            System.out.print(ele + " ");
        }
        System.out.println();

        sc.close();
    }

    public static int[] Searchrange(int[] arr, int target){

        int n =  arr.length;
        int ans[] = new int[2];

        int fp = -1;

        int low = 0, high = n-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                if(mid>0 && arr[mid]==arr[mid-1]){
                    high = mid-1;
                }
                else{
                    fp = mid;
                    break;
                }
            }

            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }


        int lp = -1;

        low = 0; high = n-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                if(mid+1<n && arr[mid]==arr[mid+1]){
                    low = mid+1;
                }
                else{
                    lp = mid;
                    break;
                }
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        ans[0] = fp;
        ans[1] = lp;

        return ans;
        
    }
}
