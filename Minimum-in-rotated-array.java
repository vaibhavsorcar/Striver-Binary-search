import java.util.*;
public class Rotated {
    public static int findMin(int[] arr) {
        int low = 0, high = arr.length - 1, ans = arr[0];
        while (low <= high) {
            int mid = (low + high) / 2;
            ans = Math.min(ans, arr[mid]);
            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println("The minimum element is: " + findMin(arr));
    }
}
