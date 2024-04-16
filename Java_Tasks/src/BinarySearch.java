import java.util.Arrays;


public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 2 ;
        int ele = binarySearchItem(arr, n, 0, arr.length-1);
        if(ele == -1){
            System.out.println("Element is not found");
        }else{
            System.out.println(arr[ele] +" Found");
        }

    }

    private static int binarySearchItem(int[] arr, int n, int low, int high) {

        int mid = (low + high) / 2 ;
        while(low <= high){

            if(arr[mid] == n){
                return mid;
            }else if(arr[mid] < n){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            mid = (low + high)/2;
        }
        return -1;

    }
}
