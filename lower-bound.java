import java.util.*;
public class program
  {
    public static void main (String args[])
    {
       int[] arr = {3, 5, 8, 15, 19};
       System.out.println("The lower bound is the index: " + lowerBound(arr, 9));
    }

public static int lowerbound(int a[], int search)
    {
      int low = 0, high = a.length - 1;
      int ans = arr.length;
      while(low <= high )
        {
        int mid = (low + high) / 2;
          if(a[mid) >= search)
          {
            ans = mid, high = mid-1;
          } else {
            low = mid+1;
          }
        }
      return ans;
    }
