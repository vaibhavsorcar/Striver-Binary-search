import java.util.*;
public class program {
    public static int findKRotation(int[] arr) {
        int low = 0, high = arr.length - 1, ans = Integer.MAX_VALUE, index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    index = low; ans = arr[low];
                }
                break;
            }
          
            if (arr[low] <= arr[mid]) {
                if (arr[low] < ans) {
                    index = low; ans = arr[low];
                }
                low = mid + 1;
            } else {
                if (arr[mid] < ans) {
                    index = mid; ans = arr[mid];
                }
                high = mid - 1;
            }
          
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println("The array is rotated " + findKRotation(arr) + " times.");
    }
}
