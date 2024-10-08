public class program {
    public static int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1, ans = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid; high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        System.out.println("The upper bound is the index: " + upperBound(arr, 9));
    }
}
