public class fnl {
    public static int solve(int n, int key, int[] v) {
        int low = 0, high = n - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (v[mid] == key) {
                res = mid; 
                low = mid + 1;
            } else if (key < v[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] v = {3, 4, 13, 13, 13, 20, 40};
        System.out.println(solve(v.length, 13, v));
    }
}
