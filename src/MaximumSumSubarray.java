public class MaximumSumSubarray {

    public static void main(String[] args) {

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > max)
                    max = sum;
            }
        }
        System.out.println("Max : " + max);
        System.out.println("=================== kaden's formula");
        int finalMax = Integer.MIN_VALUE;
        int maxTillHere = 0;

        int sum1 = 0;
        for (int i=0 ;i<arr.length; i++) {
            maxTillHere += arr[i];
            if (maxTillHere > finalMax)
                finalMax = maxTillHere;
            if (maxTillHere < 0)
                maxTillHere  = 0;
        }
        System.out.println("Max : " + finalMax);
    }
}
