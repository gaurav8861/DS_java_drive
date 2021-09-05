public class SortZeroOneAndTwo {

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1, 2};

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if (arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if (arr[mid] == 1){
                mid++;
            }else if (arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
