import java.util.*;

public class PracticeTest {

    private static PracticeTest obj = null;

    private PracticeTest(){


    }
    public static PracticeTest getSingletonObj(){
        if (obj != null){
            obj = new PracticeTest();
            return obj;
        }else{
            return obj;
        }
    }


    public static void getArr(){
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 7, 11, -6, 2, 5);
        Collections.sort(lst);
        int j = 1;
        for (int i =0 ; i< lst.size(); i++){
            if(lst.get(i) >= j){
                j = lst.get(i);
                if (lst.contains(j+1)){
                    j = j+1;
                }else {
                    System.out.println(j+1);
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        getArr();
    }

}



