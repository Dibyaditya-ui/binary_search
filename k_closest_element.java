
import java.util.ArrayList;

public class k_closest_element {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int low = 0;
        int high = n-1;

        int k = 4;
        int x = 3;
        int temp =-1;

        ArrayList<Integer> ans = new ArrayList<>();

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==x){
                temp = x;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        for(int i=1; i<k; i++){
            
        }

    }
}
