package Array;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerPractice {

    public static void main(String[] args) {


//        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,3));
//
//        List<Integer> dup =new ArrayList<>();
//        List<Integer> toberemoved = new ArrayList<>();
//        for(int i=0; i < list.size();i++){
//            if(dup.contains(list.get(i))){
//                list.remove(i);
//            }
//            dup.add(i);
//        }
////        for(Integer i : toberemoved){
////            list.remove(i);
////        }
//        System.out.println(list);
//
//        String s = "aaaBccddd";
////        System.out.println(superString(s));
//
//        char ch[] = s.toCharArray();
//        int count = 0;
//        for (int i=0; i<s.length(); i++){
//            System.out.println((int)ch[i]);
//            if((65 <= ch[i]) && ((int)ch[i] <=90)){
//                count++;
//            }
//        }
//        System.out.println(count+1);
//
//
//        String s1 = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
//        int len = s1.length();
//        int c =0 ;
//        for (int j=0; j< len; j=j+3){
//            String s2 = s1.substring(j, j+3);
//            System.out.println(s2);
//            if (!s2.equals("SOS")){
//                if(s2.charAt(0) != 'S'){
//                    c++;
//                }
//                if(s2.charAt(1) != 'O'){
//                    c++;
//                }
//                if(s2.charAt(2) != 'S'){
//                    c++;
//                }
//            }
//        }
//        System.out.println(c);
//        String s = "www.abc.xy";
//        int k =87;
//        char ch1[] = s.toCharArray();
//        for (int i=0; i<s.length();i++){
//            int tmp = ch1[i];
//            if((tmp >=65 && tmp<=90)|| (tmp >=97 && tmp<=122)){
//                int sum = tmp+k;
//                if(tmp >=65 && tmp<=90){
//                    while (!(sum >=65 && sum<=90)){
//                        sum = sum-26;
//                    }
//                    ch1[i] = (char)(sum);
//                }else {
//                    while (!(sum >=97 && sum<=122)){
//                        sum = sum-26;
//                    }
//                    ch1[i] = (char)(sum);
//                }
//            }
//        }

//        System.out.println(String.valueOf(ch1));

//        System.out.println(minimumNumber(7, "AUzs-nV"));

//        Instant start = Instant.now();
//        System.out.println(superDigit("148", 100000));
//        Instant end = Instant.now();
//        Duration timeElapsed = Duration.between(start, end);
//        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");


        System.out.println(powerSum(100, 2));
    }

    public static String superString(String s) {
        char ch[] = s.toCharArray();
        if (s.length() < 1) {
            return "Empty String";
        }
        if (s.length() == 1) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                return superString(s.substring(0, i) + s.substring(i + 2, s.length()));
            }
        }
        return s;
    }

    public static int minimumNumber(int n, String password) {
        int min = 0;
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean splcharFlag = false;
        String specialCharacter = "[!@#$%^&*()\\-+]";
        Pattern r = Pattern.compile(specialCharacter);
        Matcher m = r.matcher(password);
        if (m.find()) {
            splcharFlag = true;
        }

        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                numberFlag = true;
            } else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
            if (numberFlag && capitalFlag && lowerCaseFlag) {
                break;
            }
        }
        if (!splcharFlag) min++;
        if (!numberFlag) min++;
        if (!capitalFlag) min++;
        if (!lowerCaseFlag) min++;
        while ((password.length() + min) < 6) {
            min++;
        }
        return min;
    }

    public static int superDigit(String n, int k) {
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        sum *= k;
        return superDigitRe(sum, 0);
    }

    public static int superDigitRe(long n, int sum) {
        if (n == 0)
            return 0;
        return (int) ((n % 9 == 0) ? 9 : (n % 9));
    }

    public static int powerSum(int X, int N) {
        // 100, 2
        int count = 0;
        double n = Math.exp(Math.log((double) X)/ (double) N);

        for (int i=1; i<=(int)n; i++){
            if ((int)Math.pow(i, N) == X){
                count++;
            }
        }
        return count;
    }
}
