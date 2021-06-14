import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank {

    public static void main(String[] args) {
//        System.out.println(digit(10, 10, 0, 10, false, false));

//        System.out.println(breakingRecords(new ArrayList<Integer>(Arrays.asList(3,4,21,36,10,28,35,5,24,42))));
        System.out.println(birthday(Arrays.asList(1,4), 4, 1));
    }
    public static int digit(int n, int left, int count, int original, boolean isCheck, boolean isBreak) {
        if(left == 0 && isBreak){
            return count;
        }
        if (isCheck && left != 0 && original%left == 0)
            count++;
        if (String.valueOf(n).length() == 1)
            isBreak = true;
        return digit(n/10,n%10, count, original, true, isBreak);
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int bestCount = 0;
        int worstCount = 0;
        if (scores.size() == 0)
            return Arrays.asList(bestCount, worstCount);
        int highest = scores.get(0);
        int lowest = scores.get(0);

        for (int i=1; i<scores.size(); i++){
            if (scores.get(i) > highest){
                bestCount++;
                highest = scores.get(i);
            }
            if (scores.get(i) < lowest){
                worstCount++;
                lowest = scores.get(i);
            }
        }
        return Arrays.asList(bestCount, worstCount);

    }

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i=0; i<s.size(); i++){
            int sum = 0;
            for (int j=i; j<(m+i) && j<s.size(); j++){
                sum += s.get(j);
            }
            if (sum == d)
                count++;
        }
        return count;
    }
}
