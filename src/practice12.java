import java.util.*;


public class practice12 {

    public static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(a, a%b);
    }

    public static int lcm(int a, int b){
        return ((a*b)/gcd(a, b));
    }

    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67,38, 33);
        System.out.println(gradingStudents(grades));

    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        for(int i=0; i< grades.size(); i++){
            if(grades.get(i) >= 38){
                int diff = 5 - (grades.get(i) % 5);
                if (3 > diff){
                    grades.set(i, grades.get(i)+diff);
                }
            }
        }
        return grades;
    }

}
