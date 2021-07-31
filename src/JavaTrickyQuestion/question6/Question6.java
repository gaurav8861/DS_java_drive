package JavaTrickyQuestion.question6;

class A{
    public void printStringData(Object obj){
        System.out.println("Method with object is called !!!");
    }
    public void printStringData(String obj){
        System.out.println("Method with String is called !!!");
    }
    public void printStringData(StringBuffer obj){
        System.out.println("Method with StringBuffer is called !!!");
    }
}
public class Question6 {
    public static void main(String[] args) {
        A a = new A();
//        a.printStringData(null);
    }
}
