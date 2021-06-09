import java.io.*;
import java.util.*;

public class INputSca {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        Integer q = Integer.parseInt(sc.nextLine());
        List<String> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            String s = sc.nextLine();
            queries.add(s);
        }
        qHead(queries);

    }

    public static void qHead(List<String> queries) {
        List<Integer> h = new ArrayList<Integer>();
        Integer min = null;
        for (String query : queries) {
            String str[] = query.split(" ");
            switch (Integer.parseInt(str[0])) {
                case 1:
                    //add
                    Integer va =Integer.parseInt(str[1]);
                    if(min == null){
                        min = va;
                    }else{
                        if (va < min){
                            min = va;
                        }
                    }
                    h.add(va);
                    break;
                case 2:
                    //delete
                    Integer va1 = Integer.parseInt(str[1]);
                    h.remove(h.indexOf(va1));
                    if (va1.intValue() == min.intValue()){
                        OptionalInt neVal = h.stream().mapToInt(a -> a).min();
                        if(neVal.isPresent())
                            min = neVal.getAsInt();
                        else min=null;
                    }

                    break;
                case 3:
                    //print

                    System.out.println(min);
                    break;
            }
        }
    }
}

