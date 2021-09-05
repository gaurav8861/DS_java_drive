public class MaximumProductSubarray {

    public static void main(String[] args) {

        int arr[] = { -6, 4, -5, 8, -10, 0, 8 };
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 1;
                for (int k = i; k <= j; k++) {
                    sum *= arr[k];
                }
                if (sum > max)
                    max = sum;
            }
        }
        System.out.println("Max : " + max);
        System.out.println("===================");

        int finalMax = arr[0];
        int minTillHere = arr[0];
        int maxTillHere = arr[0];

        for (int i=1; i<arr.length; i++){
            int tmp = maxTillHere;
            maxTillHere = Math.max(arr[i], Math.max(maxTillHere * arr[i], minTillHere * arr[i]));
            minTillHere = Math.min(arr[i], Math.min(tmp * arr[i], minTillHere * arr[i]));
            finalMax = Math.max(finalMax, maxTillHere);
        }
        System.out.println("Max : " + finalMax);
    }
}
