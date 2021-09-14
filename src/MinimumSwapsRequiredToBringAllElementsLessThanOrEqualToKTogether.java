import java.util.Map;

public class MinimumSwapsRequiredToBringAllElementsLessThanOrEqualToKTogether {

    public static void main(String[] args) {

        int arr[] = {2, 1, 3, 6, 5};
        int k = 5;

        int good = 0;
        int bad = 0;
        int ans = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if(k >= arr[i]){
                good++;
            }
        }
        for (int p=0; p<good; p++){
            if (arr[p] > k) bad++;
        }
        int l = 0;
        int r = good-1;
        while (r < arr.length){
            System.out.println("l=" + l + " , r=" + r);
            if (arr[l] < k) bad--;
            if (arr[r] >= k) bad++;
            ans = Math.min(ans, bad);
            l++;
            r++;
        }

        System.out.println(ans);
    }
}
