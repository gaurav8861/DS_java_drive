package Test;


import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(10,9,8,1,3,6);

        int min = 0;

//        for (int i=0; i< lst.size() ;i++){
//            if (min < lst.get(i)){
//                min = lst.get(i);
//            }
//        }


        int low = 0;
        int high=lst.size();
        int aMin = lst.get(0);
        for (int i=0; i< lst.size() ;i++){

            int mid = (low+high)/2;
            if (lst.get(mid) > lst.get(i)){

            } else {

            }

        }




    }
}
