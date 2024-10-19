import java.util.Arrays;
public class AssignCookies {
    public static int findContentChildren(int[] greed, int[] cookieSize) {
        Arrays.sort(greed);
        Arrays.sort(cookieSize);
        int l = 0, r = 0;

        while (l < cookieSize.length && r < greed.length) {
            if (greed[r] <= cookieSize[l]) r++;
            l++;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] greed = {1, 5, 3, 3, 4};
        System.out.println("Greed: " + Arrays.toString(greed));
        int ans = findContentChildren(greed, cookieSize);
        System.out.println("Number of kids assigned cookies: " + ans);
    }
}
