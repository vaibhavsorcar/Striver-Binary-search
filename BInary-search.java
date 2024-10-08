import java.util.*;
public class bin_search {

    public static int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        return nums[mid] == target ? mid : 
               target > nums[mid] ? binarySearch(nums, mid + 1, high, target) : 
               binarySearch(nums, low, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int ind = binarySearch(a, 0, a.length - 1, 6);
        System.out.println(ind == -1 ? "Not present." : "At index: " + ind);
    }
}
