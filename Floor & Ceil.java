import java.util.*;

public class Program {
    static int findFloor(int[] arr, int n, int x) {
        int low = 0, high = n - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static int findCeil(int[] arr, int n, int x) {
        int low = 0, high = n - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int[] getFloorAndCeil(int[] arr, int n, int x) {
        return new int[] {findFloor(arr, n, x), findCeil(arr, n, x)};
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int[] ans = getFloorAndCeil(arr, arr.length, 5);
        System.out.println("The floor and ceil are: " + ans[0] + " " + ans[1]);
    }
}
