package JavaTrickyQuestion;

public class Question10 {

    public static void main(String[] args) {
        public static String name = "gaurav";

        final class ContantData{
            public void printData(){
                System.out.println(name);
            }
        }
        ContantData cd = new ContantData();
        cd.printData();
    }
}
