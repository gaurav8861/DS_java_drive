package Array;

public class SecondAndThirdLargest {

    public static void main(String[] args) {
        int arr[] = new int[]{21,34,78,24,7,234};
        System.out.println("Second Largest : " + secondLargest(arr));
        System.out.println("Third Largest : " + thirdLargest(arr));
    }
    public static int secondLargest(int arr[]){
        int firstLargest = arr[0];
        int secondLarget = Integer.MIN_VALUE;
        for (int i=1; i<arr.length; i++){
            if (arr[i] > firstLargest){
                secondLarget = firstLargest;
                firstLargest = arr[i];
            }else if(arr[i] > secondLarget){
                secondLarget = arr[i];
            }
        }
        return secondLarget;
    }
    public static int thirdLargest(int arr[]){
        int firstLargest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        int thirdLargest=Integer.MIN_VALUE;

        for (int i=1; i<arr.length; i++){
            if (arr[i] > firstLargest){
                thirdLargest=secondLargest;
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }else if (arr[i] > secondLargest && arr[i] < firstLargest){
                thirdLargest=secondLargest;
                secondLargest=arr[i];
            }else if(arr[i] > thirdLargest && arr[i] < secondLargest){
                thirdLargest = arr[i];
            }
        }
        return thirdLargest;
    }
}
