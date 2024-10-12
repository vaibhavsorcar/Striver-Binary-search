// import java.util.*;
import java.util.*;
public class Sorted {
    public static int search(ArrayList<Integer> arr, int k) {
        int low = 0, high = arr.size() - 1;
      
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == k) 
              return mid;
            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) <= k && k <= arr.get(mid)) 
                  high = mid - 1;
                else low = mid + 1;
            } 
            
            else {
                if (arr.get(mid) <= k && k <= arr.get(high)) 
                  low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int k = 1;
        int ans = search(arr, k);
        System.out.println(ans == -1 ? "Target is not present." : "The index is: " + ans);
    }
}
