public class peak_in_a_mountain {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 35, 50, 60, 70, 20, 15};

        int n = arr.length;
        int low1 = 1;
        int high1 = n-2;

        int peak = -1;

        while(low1<=high1){
            int mid1 = low1+(high1-low1)/2;
            if(arr[mid1]>arr[mid1-1] && arr[mid1]>arr[mid1+1]){
                peak = mid1;
                System.out.println("Peak element is at index "+mid1+" that is "+ arr[mid1]);
                break;

        }
        else if(arr[mid1]<arr[mid1+1] && arr[mid1]>arr[mid1-1]){
            low1 = mid1+1;
        }
        else if(arr[mid1]<arr[mid1-1] && arr[mid1]>arr[mid1+1]){
            high1 = mid1-1;
        }
       }
    }
}
