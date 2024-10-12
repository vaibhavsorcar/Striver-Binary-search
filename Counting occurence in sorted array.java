public class Occurence {
    public static int findOccurrence(int[] arr, int k, boolean first) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                result = mid; 
                if (first) high = mid - 1; 
                else low = mid + 1;
            } else if (arr[mid] < k) low = mid + 1;
            else high = mid - 1;
        }
        return result;
    }

    public static int count(int[] arr, int k) {
        int first = findOccurrence(arr, k, true);
        return first == -1 ? 0 : findOccurrence(arr, k, false) - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        System.out.println("The number of occurrences is: " + count(arr, 8));
    }
}
