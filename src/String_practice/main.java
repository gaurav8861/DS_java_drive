package String_practice;

public class main {

    public static void main(String[] args) {

        String str1 = "gaurav";
        String str2 = "gaurav";

        System.out.println(str1 + " : " + str1.hashCode());
        System.out.println(str2 + " : " + str2.hashCode());

        if (str1 == str2){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}
